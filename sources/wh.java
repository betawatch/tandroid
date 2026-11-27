// default package

import android.content.Context;
import android.os.Vibrator;
import android.text.Spanned;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class wh extends yk2 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ NumberTextView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh(int i, Context context, NumberTextView numberTextView) {
        super(i);
        this.b = context;
        this.c = numberTextView;
    }

    @Override // yk2, android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        CharSequence filter = super.filter(charSequence, i, i2, spanned, i3, i4);
        if (filter != null && charSequence != null && filter.length() != charSequence.length()) {
            Vibrator vibrator = (Vibrator) this.b.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            hl.z3(this.c);
        }
        return filter;
    }
}
