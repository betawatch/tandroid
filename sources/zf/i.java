package zf;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.ui.Cells.b9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i extends b9 {
    public long D;
    public int E;
    public int F;
    public final /* synthetic */ m G;
    public int x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, Context context) {
        super(context);
        this.G = mVar;
    }

    @Override // org.telegram.ui.Cells.b9
    public final void a() {
        m mVar = this.G;
        Drawable drawable = mVar.O;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            Drawable drawable2 = mVar.O;
            int i10 = this.E;
            drawable2.setBounds(i10, this.F, bounds.width() + i10, bounds.height() + this.F);
        }
    }

    @Override // org.telegram.ui.Cells.b9
    public final void b() {
        m mVar = this.G;
        Drawable drawable = mVar.O;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int L = (int) (this.y * org.telegram.messenger.i0.L(3.0f));
            int i10 = bounds.left;
            this.E = i10;
            int i11 = bounds.top;
            this.F = i11;
            mVar.O.setBounds(i10 + L, org.telegram.messenger.i0.L(1.0f) + i11, bounds.width() + this.E + L, bounds.height() + org.telegram.messenger.i0.L(1.0f) + this.F);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.D;
            if (j10 > 17) {
                j10 = 17;
            }
            this.D = elapsedRealtime;
            if (this.x == 0) {
                float f7 = (j10 / 664.0f) + this.y;
                this.y = f7;
                if (f7 >= 1.0f) {
                    this.x = 1;
                    this.y = 1.0f;
                }
            } else {
                float f10 = this.y - (j10 / 664.0f);
                this.y = f10;
                if (f10 <= 0.0f) {
                    this.x = 0;
                    this.y = 0.0f;
                }
            }
            getTextView().invalidate();
        }
    }
}
