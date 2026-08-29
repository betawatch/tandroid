package th;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class b0 extends View {
    public final RichMessageLayout.RichButton a;
    public final int b;
    public boolean c;
    public boolean d;
    public final sf.p1 e;
    public final /* synthetic */ e0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(e0 e0Var, Context context, TL_keyboard.PageButton pageButton, int i10) {
        super(context);
        this.f = e0Var;
        this.b = i10;
        RichMessageLayout.RichButton createEditorPageButton = RichMessageLayout.createEditorPageButton(e0Var.n, j7.l1.d(32.0f, AndroidUtilities.displaySize.x, AndroidUtilities.dp(240.0f)), e0Var.r, pageButton, new org.telegram.ui.web.t1(this, 24));
        this.a = createEditorPageButton;
        this.e = new sf.p1(this, i10, 2);
        createEditorPageButton.width = createEditorPageButton.getPreferredWidth();
        setContentDescription(v5.l(pageButton.text));
        setClickable(true);
        setLongClickable(true);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.attach(this);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        AndroidUtilities.cancelRunOnUIThread(this.e);
        this.a.detach(this);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = getHeight();
        RichMessageLayout.RichButton richButton = this.a;
        canvas.translate(0.0f, (height - richButton.getHeight()) / 2.0f);
        richButton.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        RichMessageLayout.RichButton richButton = this.a;
        setMeasuredDimension(richButton.width, AndroidUtilities.dp(8.0f) + richButton.getHeight());
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e0 e0Var;
        c0 c0Var;
        a aVar;
        int actionMasked = motionEvent.getActionMasked();
        sf.p1 p1Var = this.e;
        RichMessageLayout.RichButton richButton = this.a;
        if (actionMasked == 0) {
            this.c = true;
            this.d = false;
            richButton.setPressed(true);
            AndroidUtilities.runOnUIThread(p1Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (actionMasked == 1) {
            boolean z10 = this.c && !this.d;
            this.c = false;
            richButton.setPressed(false);
            AndroidUtilities.cancelRunOnUIThread(p1Var);
            if (z10 && (c0Var = (e0Var = this.f).A) != null && (aVar = e0Var.a) != null) {
                p3 p3Var = ((h3) c0Var).a;
                TL_iv.PageBlock pageBlock = aVar.b;
                if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                    TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                    int i10 = this.b;
                    if (i10 >= 0 && i10 < pageblockbuttonrow.buttons.size()) {
                        b2 b2Var = p3Var.F3;
                        if (b2Var != null) {
                            b2Var.d();
                        }
                        TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i10);
                        if (pageButton != null) {
                            TL_keyboard.RichButtonStyle richButtonStyle = pageButton.style;
                            char c3 = (richButtonStyle == null || !richButtonStyle.bg_primary) ? (richButtonStyle == null || !richButtonStyle.bg_danger) ? (richButtonStyle == null || !richButtonStyle.bg_success) ? (char) 1 : (char) 0 : (char) 3 : (char) 2;
                            if (richButtonStyle == null) {
                                richButtonStyle = new TL_keyboard.RichButtonStyle();
                            }
                            richButtonStyle.flags = 0;
                            richButtonStyle.bg_primary = c3 == 1;
                            richButtonStyle.bg_danger = c3 == 2;
                            richButtonStyle.bg_success = c3 == 3;
                            richButtonStyle.link = false;
                            pageButton.style = richButtonStyle;
                        }
                        p3Var.U2.N(false);
                        b2 b2Var2 = p3Var.F3;
                        if (b2Var2 != null) {
                            b2Var2.h();
                        }
                        p3Var.d3.onContentChanged();
                    }
                }
            }
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return super.onTouchEvent(motionEvent);
                }
                this.c = false;
                richButton.setPressed(false);
                AndroidUtilities.cancelRunOnUIThread(p1Var);
                return true;
            }
            if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                this.c = false;
                richButton.setPressed(false);
                AndroidUtilities.cancelRunOnUIThread(p1Var);
                return true;
            }
        }
        return true;
    }
}
