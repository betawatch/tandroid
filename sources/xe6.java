// default package

import android.content.Context;
import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xe6 extends tk2 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xe6(byte b, Context context, Object obj) {
        super(context);
        this.h = b;
        this.n = obj;
    }

    @Override // tk2
    public final void a() {
        byte b = this.h;
        Object obj = this.n;
        switch (b) {
            case 0:
                ((ze6) obj).h(null);
                break;
            case 1:
                ((sf6) obj).h(null);
                break;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (!passcodeActivity.F) {
                    postDelayed(new kl7(this, (byte) 11), 260L);
                    break;
                } else {
                    passcodeActivity.u0();
                    break;
                }
            default:
                ((p5c) obj).H0();
                break;
        }
    }
}
