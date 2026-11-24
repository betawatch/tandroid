// default package

import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class rn0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SpannableStringBuilder b;

    public /* synthetic */ rn0(SpannableStringBuilder spannableStringBuilder, byte b) {
        this.a = b;
        this.b = spannableStringBuilder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        SpannableStringBuilder spannableStringBuilder = this.b;
        switch (b) {
            case 0:
                c41 Y = c41.Y();
                if (Y != null) {
                    Y.Q(R.raw.forward, 30, spannableStringBuilder).j();
                    break;
                }
                break;
            default:
                u31 I = yr7.h().I(R.raw.contact_check, jb6.M0(2131749515, null), spannableStringBuilder);
                I.u = true;
                I.j();
                break;
        }
    }
}
