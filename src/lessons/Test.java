// public, private,
// default (все что default доступно в пределах этого метода),
// protected (доступно в пределах одного пакета,
// доступны всем подклассам, даже если эти подклассы вне пакета)

import Packet1.Person;

class Test extends Person {
    public Test(){
        name = "Tom";
    }
}
