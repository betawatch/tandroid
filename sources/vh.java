// default package

import android.content.Context;
import android.os.Vibrator;
import android.text.Spanned;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class vh extends dk2 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ NumberTextView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh(int i, Context context, NumberTextView numberTextView) {
        super(i);
        this.b = context;
        this.c = numberTextView;
    }

    @Override // dk2, android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        CharSequence filter = super.filter(charSequence, i, i2, spanned, i3, i4);
        if (filter != null && charSequence != null && filter.length() != charSequence.length()) {
            Vibrator vibrator = (Vibrator) this.b.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            gl.A3(this.c);
        }
        return filter;
    }
}
