package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a31 b;

    public /* synthetic */ z21(a31 a31Var, int i7) {
        this.a = i7;
        this.b = a31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String sb2;
        int i7 = this.a;
        a31 a31Var = this.b;
        switch (i7) {
            case 0:
                String str = a31Var.b.text;
                if (str == null || !str.equals("AUTH_TOKEN_EXCEPTION")) {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.messenger.camera.q.q(null, 2131751105, sb3, "\n");
                    sb3.append(a31Var.b.text);
                    sb2 = sb3.toString();
                } else {
                    sb2 = org.telegram.messenger.id.M0(2131754709, null);
                }
                org.telegram.ui.Components.u4.r0(a31Var.c, org.telegram.messenger.id.M0(2131753894, null), sb2, null);
                break;
            default:
                org.telegram.ui.Components.u4.r0(a31Var.c, org.telegram.messenger.id.M0(2131753894, null), org.telegram.messenger.id.M0(2131751105, null), null);
                break;
        }
    }
}
