
import React from 'react'

import cn from 'arui-feather/cn';

import AppTitle from 'arui-feather/app-title'
import AppContent from 'arui-feather/app-content'
import AuthForm from '../authform/authform'
import Footer from 'arui-feather/footer'
import Header from 'arui-feather/header'
import Heading from 'arui-feather/heading'
import Page from 'arui-feather/page'


class App extends React.Component {

    render(cn) {
        return (
            <Page header={ <Header />} footer={<Footer />} >
                <AppTitle>
                    <Heading>Тестовый стенд</Heading>
                </AppTitle>
                <AppContent>
                    <AuthForm/>
                </AppContent>
            </Page>
        );
    }
}

export default App;