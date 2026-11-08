package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x21 b;

    public /* synthetic */ w21(x21 x21Var, int i7) {
        this.a = i7;
        this.b = x21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String sb2;
        int i7 = this.a;
        x21 x21Var = this.b;
        switch (i7) {
            case 0:
                String str = x21Var.b.text;
                if (str == null || !str.equals("AUTH_TOKEN_EXCEPTION")) {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.messenger.camera.q.q(null, 2131751106, sb3, "\n");
                    sb3.append(x21Var.b.text);
                    sb2 = sb3.toString();
                } else {
                    sb2 = org.telegram.messenger.id.M0(2131754709, null);
                }
                org.telegram.ui.Components.v4.r0(x21Var.c, org.telegram.messenger.id.M0(2131753894, null), sb2, null);
                break;
            default:
                org.telegram.ui.Components.v4.r0(x21Var.c, org.telegram.messenger.id.M0(2131753894, null), org.telegram.messenger.id.M0(2131751106, null), null);
                break;
        }
    }
}
