package rf;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.y8;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class h extends y8 {
    public int A;
    public final /* synthetic */ l B;
    public int v;
    public float w;
    public long x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, Context context) {
        super(context);
        this.B = lVar;
    }

    @Override // org.telegram.ui.Cells.y8
    public final void a() {
        l lVar = this.B;
        Drawable drawable = lVar.K;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            Drawable drawable2 = lVar.K;
            int i10 = this.y;
            drawable2.setBounds(i10, this.A, bounds.width() + i10, bounds.height() + this.A);
        }
    }

    @Override // org.telegram.ui.Cells.y8
    public final void b() {
        l lVar = this.B;
        Drawable drawable = lVar.K;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int dp = (int) (this.w * AndroidUtilities.dp(3.0f));
            int i10 = bounds.left;
            this.y = i10;
            int i11 = bounds.top;
            this.A = i11;
            lVar.K.setBounds(i10 + dp, AndroidUtilities.dp(1.0f) + i11, bounds.width() + this.y + dp, bounds.height() + AndroidUtilities.dp(1.0f) + this.A);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.x;
            if (j10 > 17) {
                j10 = 17;
            }
            this.x = elapsedRealtime;
            if (this.v == 0) {
                float f9 = (j10 / 664.0f) + this.w;
                this.w = f9;
                if (f9 >= 1.0f) {
                    this.v = 1;
                    this.w = 1.0f;
                }
            } else {
                float f10 = this.w - (j10 / 664.0f);
                this.w = f10;
                if (f10 <= 0.0f) {
                    this.v = 0;
                    this.w = 0.0f;
                }
            }
            getTextView().invalidate();
        }
    }
}
