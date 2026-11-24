// default package

import android.content.Context;
import android.os.Vibrator;
import android.text.Spanned;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zj extends ql2 {
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj(Context context) {
        super(nm7.d4);
        this.b = context;
    }

    @Override // ql2, android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        Vibrator vibrator;
        CharSequence filter = super.filter(charSequence, i, i2, spanned, i3, i4);
        if (filter != null && charSequence != null && filter.length() != charSequence.length() && (vibrator = (Vibrator) this.b.getSystemService("vibrator")) != null) {
            vibrator.vibrate(200L);
        }
        return filter;
    }
}
