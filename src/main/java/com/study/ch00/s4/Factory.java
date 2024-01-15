package com.study.ch00.s4;

class Factory {
        private static Factory instance;
        private String factoryName;

        private Factory() {}

        public static Factory getInstance() {
            if(instance == null) {
                instance = new Factory();
            }
            return instance;
        }
}
