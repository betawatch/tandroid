package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jo b;

    public /* synthetic */ tn(jo joVar, int i7) {
        this.a = i7;
        this.b = joVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jo joVar = this.b;
                joVar.d0 = true;
                joVar.h0();
                break;
            case 1:
                jo joVar2 = this.b;
                joVar2.Y = joVar2.getMessagesController().O0(Long.valueOf(joVar2.a0));
                joVar2.e0();
                break;
            case 2:
                this.b.g0(false);
                break;
            case 3:
                jo joVar3 = this.b;
                joVar3.d0 = true;
                if (joVar3.b.length() > 0) {
                    joVar3.c0(joVar3.b.getText().toString());
                }
                joVar3.h0();
                break;
            case 4:
                this.b.e0();
                break;
            default:
                this.b.g0(true);
                break;
        }
    }
}
