// default package

import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class sb2 {
    public final boolean a;
    public final ImageReceiver b;
    public final rb0 c;
    public final RectF d;
    public final v41 e;
    public StaticLayout f;
    public StaticLayout g;
    public StaticLayout h;
    public boolean i;
    public int j;
    public hf0 k;
    public int l;
    public va6 m;
    public boolean n;
    public final float[] o;

    public sb2(wb2 wb2Var, boolean z) {
        ImageReceiver imageReceiver = new ImageReceiver(wb2Var);
        this.b = imageReceiver;
        this.c = new rb0((vnb) null);
        this.d = new RectF();
        this.e = new v41(wb2Var);
        this.o = new float[8];
        this.a = z;
        imageReceiver.q0(hl.L(16.0f) / 2);
        if (wb2Var.O0) {
            imageReceiver.I();
        }
    }

    public final void a(String str, TLObject tLObject, CharSequence charSequence, TextPaint textPaint, CharSequence charSequence2, int i) {
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.UserProfilePhoto userProfilePhoto;
        int L = i - hl.L(22.0f);
        this.j = hl.L(16.0f);
        StaticLayout X2 = wb2.X2(L, wb2.Jd, str);
        this.f = X2;
        if (X2 != null) {
            int L2 = hl.L(4.0f) + wb2.N1(X2);
            L -= L2;
            this.j = uh9.w(6.0f, L2, this.j);
        }
        int i2 = 0;
        boolean z = tLObject != null && (!(tLObject instanceof TLRPC.User) ? !(tLObject instanceof TLRPC.Chat) || (chatPhoto = ((TLRPC.Chat) tLObject).photo) == null || chatPhoto.photo_small == null : (userProfilePhoto = ((TLRPC.User) tLObject).photo) == null || userProfilePhoto.photo_small == null);
        this.i = z;
        ImageReceiver imageReceiver = this.b;
        if (z) {
            rb0 rb0Var = this.c;
            rb0Var.o(tLObject);
            imageReceiver.U(tLObject, rb0Var, null);
            L -= hl.L(21.0f);
            this.j = uh9.w(21.0f, this.f == null ? hl.L(6.0f) : 0, this.j);
        } else {
            imageReceiver.f();
        }
        SpannableStringBuilder O3 = wb2.O3(charSequence2);
        int i3 = i / 2;
        StaticLayout X22 = wb2.X2(L - (O3 == null ? 0 : hl.L(4.0f) + Math.min(i3, (int) Math.ceil(wb2.Kd.measureText(O3, 0, O3.length())))), textPaint, charSequence);
        this.g = X22;
        if (X22 != null) {
            int L3 = hl.L(4.0f) + wb2.N1(X22);
            L -= L3;
            this.j = ((this.f != null || this.i) ? 0 : hl.L(6.0f)) + L3 + this.j;
        }
        StaticLayout X23 = L > hl.L(24.0f) ? wb2.X2(Math.min(i3, L), wb2.Kd, O3) : null;
        this.h = X23;
        if (X23 == null) {
            if (this.g == null && this.f == null) {
                return;
            }
            this.j -= hl.L(4.0f);
            return;
        }
        int i4 = this.j;
        if (this.f == null && !this.i && this.g == null) {
            i2 = hl.L(6.0f);
        }
        this.j = wb2.N1(this.h) + i2 + i4;
    }
}
