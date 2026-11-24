// default package

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pi3 extends ww8 {
    public final /* synthetic */ byte f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi3(sxb sxbVar, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = sxbVar;
    }

    @Override // ww8
    public final float d() {
        byte b = this.f0;
        Object obj = this.g0;
        switch (b) {
            case 0:
                return ((mk3) obj).a.getViewOffset();
            default:
                return ((sxb) obj).O.m3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi3(String str, String str2, mk3 mk3Var) {
        super(str, str2);
        this.g0 = mk3Var;
    }
}
