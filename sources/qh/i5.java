package qh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class i5 extends FrameLayout {
    public final d1 a;
    public TL_iv.pageTableCell b;

    public i5(Context context, b6 b6Var) {
        super(context);
        d1 d1Var = new d1(context, b6Var);
        this.a = d1Var;
        d1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        d1Var.setAllowNewlines(true);
        setCompact(false);
        addView(d1Var, e6.e(-1, -2, 51));
    }

    public final void a() {
        d1 d1Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d1Var.getLayoutParams();
        TL_iv.pageTableCell pagetablecell = this.b;
        int i9 = pagetablecell.align_right ? 5 : pagetablecell.align_center ? 1 : 3;
        layoutParams.gravity = pagetablecell.valign_middle ? i9 | 16 : pagetablecell.valign_bottom ? i9 | 80 : i9 | 48;
        d1Var.setLayoutParams(layoutParams);
        TL_iv.pageTableCell pagetablecell2 = this.b;
        d1Var.setGravity(pagetablecell2.align_right ? 53 : pagetablecell2.align_center ? 49 : 51);
        d1Var.setTypeface(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if ((qh.u5.q(0, r0.length(), r0) & 1) == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(TL_iv.pageTableCell pagetablecell) {
        boolean z10;
        this.b = pagetablecell;
        a();
        CharSequence h = w5.h(pagetablecell);
        if (pagetablecell.header) {
            z10 = true;
            if (h.length() != 0) {
            }
            d1 d1Var = this.a;
            d1Var.setAutoBold(z10);
            d1Var.setTextSilently(Emoji.replaceEmoji(h, d1Var.getPaint().getFontMetricsInt(), false));
            d1Var.invalidateEffects();
        }
        z10 = false;
        d1 d1Var2 = this.a;
        d1Var2.setAutoBold(z10);
        d1Var2.setTextSilently(Emoji.replaceEmoji(h, d1Var2.getPaint().getFontMetricsInt(), false));
        d1Var2.invalidateEffects();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        d1 d1Var = this.a;
        if (d1Var.getVisibility() == 0 && motionEvent.getActionMasked() != 3) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            boolean z10 = x10 >= ((float) d1Var.getLeft()) && x10 < ((float) d1Var.getRight());
            boolean z11 = y10 < ((float) d1Var.getTop()) || y10 >= ((float) d1Var.getBottom());
            if (z10 && z11 && d1Var.getHeight() > 0) {
                float max = Math.max(0.0f, Math.min(y10 - d1Var.getTop(), d1Var.getHeight() - 1));
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setLocation(x10 - d1Var.getLeft(), max);
                boolean onTouchEvent = d1Var.onTouchEvent(obtain);
                obtain.recycle();
                return onTouchEvent;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setCompact(boolean z10) {
        d1 d1Var = this.a;
        if (z10) {
            d1Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
            d1Var.setMinHeight(AndroidUtilities.dp(18.0f));
        } else {
            d1Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(9.0f));
            d1Var.setMinHeight(AndroidUtilities.dp(36.0f));
        }
    }

    public void setLocked(boolean z10) {
        this.a.setLocked(z10);
    }
}
