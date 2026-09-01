package wh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class l5 extends FrameLayout {
    public final e1 a;
    public TL_iv.pageTableCell b;

    public l5(Context context, g6 g6Var) {
        super(context);
        e1 e1Var = new e1(context, g6Var);
        this.a = e1Var;
        e1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        e1Var.setAllowNewlines(true);
        setCompact(false);
        addView(e1Var, c6.e(-1, -2, 51));
    }

    public final void a() {
        e1 e1Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e1Var.getLayoutParams();
        TL_iv.pageTableCell pagetablecell = this.b;
        int i10 = pagetablecell.align_right ? 5 : pagetablecell.align_center ? 1 : 3;
        layoutParams.gravity = pagetablecell.valign_middle ? i10 | 16 : pagetablecell.valign_bottom ? i10 | 80 : i10 | 48;
        e1Var.setLayoutParams(layoutParams);
        TL_iv.pageTableCell pagetablecell2 = this.b;
        e1Var.setGravity(pagetablecell2.align_right ? 53 : pagetablecell2.align_center ? 49 : 51);
        e1Var.setTypeface(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if ((wh.x5.q(0, r0.length(), r0) & 1) == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(TL_iv.pageTableCell pagetablecell) {
        boolean z4;
        this.b = pagetablecell;
        a();
        CharSequence h = z5.h(pagetablecell);
        if (pagetablecell.header) {
            z4 = true;
            if (h.length() != 0) {
            }
            e1 e1Var = this.a;
            e1Var.setAutoBold(z4);
            e1Var.setTextSilently(Emoji.replaceEmoji(h, e1Var.getPaint().getFontMetricsInt(), false));
            e1Var.invalidateEffects();
        }
        z4 = false;
        e1 e1Var2 = this.a;
        e1Var2.setAutoBold(z4);
        e1Var2.setTextSilently(Emoji.replaceEmoji(h, e1Var2.getPaint().getFontMetricsInt(), false));
        e1Var2.invalidateEffects();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        e1 e1Var = this.a;
        if (e1Var.getVisibility() == 0 && motionEvent.getActionMasked() != 3) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            boolean z4 = x10 >= ((float) e1Var.getLeft()) && x10 < ((float) e1Var.getRight());
            boolean z10 = y10 < ((float) e1Var.getTop()) || y10 >= ((float) e1Var.getBottom());
            if (z4 && z10 && e1Var.getHeight() > 0) {
                float max = Math.max(0.0f, Math.min(y10 - e1Var.getTop(), e1Var.getHeight() - 1));
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setLocation(x10 - e1Var.getLeft(), max);
                boolean onTouchEvent = e1Var.onTouchEvent(obtain);
                obtain.recycle();
                return onTouchEvent;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setCompact(boolean z4) {
        e1 e1Var = this.a;
        if (z4) {
            e1Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
            e1Var.setMinHeight(AndroidUtilities.dp(18.0f));
        } else {
            e1Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(9.0f));
            e1Var.setMinHeight(AndroidUtilities.dp(36.0f));
        }
    }

    public void setLocked(boolean z4) {
        this.a.setLocked(z4);
    }
}
