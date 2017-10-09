import { TEST_ACTION, TEST_START, TEST_SUCCESS, TEST_FAILRULE } from '../constants/actions';

let initialState = {};

export default function testReducer(state = initialState, action) {

    if (action.type === TEST_SUCCESS) {
        return {
            ...state,
            respResult: action.payload.result,
            answerReceived: true
        };
    }

    return {
        ...state,
        answerReceived: false
    }
}