// default package

import android.content.Context;
import android.os.Vibrator;
import android.text.Spanned;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class zi extends dk2 {
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi(Context context) {
        super(kk7.d4);
        this.b = context;
    }

    @Override // dk2, android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        Vibrator vibrator;
        CharSequence filter = super.filter(charSequence, i, i2, spanned, i3, i4);
        if (filter != null && charSequence != null && filter.length() != charSequence.length() && (vibrator = (Vibrator) this.b.getSystemService("vibrator")) != null) {
            vibrator.vibrate(200L);
        }
        return filter;
    }
}
