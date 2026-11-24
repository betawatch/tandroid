// default package

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class v92 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ba2 b;

    public /* synthetic */ v92(ba2 ba2Var, byte b) {
        this.a = b;
        this.b = ba2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ba2 ba2Var = this.b;
        switch (b) {
            case 0:
                ba2Var.l0();
                break;
            case 1:
                ba2Var.k0();
                break;
            case 2:
                ba2Var.b.dismiss();
                ba2Var.finishFragment();
                break;
            case 3:
                ba2Var.N.setChecked(ba2Var.x0.autotranslation);
                break;
            default:
                ba2Var.e.setImageDrawable(ba2Var.r);
                ba2Var.c0.o(R.drawable.msg_addphoto, jb6.M0(2131752149, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = ba2Var.D0;
                if (user != null) {
                    user.photo = null;
                    ba2Var.getMessagesController().c4(ba2Var.D0, true, false);
                }
                ba2Var.P0 = true;
                if (ba2Var.S0 == null) {
                    ba2Var.S0 = new p09(R.raw.camera_outline, gm.L(50.0f), gm.L(50.0f), false, null);
                }
                ba2Var.c0.e.setTranslationX(-gm.L(8.0f));
                ba2Var.c0.e.setAnimation(ba2Var.S0);
                break;
        }
    }
}
