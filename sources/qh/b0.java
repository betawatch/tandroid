package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.qd;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class b0 extends View {
    public final RichMessageLayout.RichButton a;
    public final int b;
    public boolean c;
    public boolean d;
    public final qd e;
    public final /* synthetic */ e0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(e0 e0Var, Context context, TL_keyboard.PageButton pageButton, int i9) {
        super(context);
        this.f = e0Var;
        this.b = i9;
        RichMessageLayout.RichButton createEditorPageButton = RichMessageLayout.createEditorPageButton(e0Var.n, org.telegram.messenger.l0.b(32.0f, AndroidUtilities.displaySize.x, AndroidUtilities.dp(240.0f)), e0Var.r, pageButton, new pf.o1(this, 3));
        this.a = createEditorPageButton;
        this.e = new qd(this, i9, 29);
        createEditorPageButton.width = createEditorPageButton.getPreferredWidth();
        setContentDescription(u5.l(pageButton.text));
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
    public final void onMeasure(int i9, int i10) {
        RichMessageLayout.RichButton richButton = this.a;
        setMeasuredDimension(richButton.width, AndroidUtilities.dp(8.0f) + richButton.getHeight());
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e0 e0Var;
        c0 c0Var;
        a aVar;
        int actionMasked = motionEvent.getActionMasked();
        qd qdVar = this.e;
        RichMessageLayout.RichButton richButton = this.a;
        if (actionMasked == 0) {
            this.c = true;
            this.d = false;
            richButton.setPressed(true);
            AndroidUtilities.runOnUIThread(qdVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (actionMasked == 1) {
            boolean z10 = this.c && !this.d;
            this.c = false;
            richButton.setPressed(false);
            AndroidUtilities.cancelRunOnUIThread(qdVar);
            if (z10 && (c0Var = (e0Var = this.f).A) != null && (aVar = e0Var.a) != null) {
                o3 o3Var = ((g3) c0Var).a;
                TL_iv.PageBlock pageBlock = aVar.b;
                if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                    TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                    int i9 = this.b;
                    if (i9 >= 0 && i9 < pageblockbuttonrow.buttons.size()) {
                        b2 b2Var = o3Var.F3;
                        if (b2Var != null) {
                            b2Var.d();
                        }
                        TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i9);
                        if (pageButton != null) {
                            TL_keyboard.RichButtonStyle richButtonStyle = pageButton.style;
                            char c10 = (richButtonStyle == null || !richButtonStyle.bg_primary) ? (richButtonStyle == null || !richButtonStyle.bg_danger) ? (richButtonStyle == null || !richButtonStyle.bg_success) ? (char) 1 : (char) 0 : (char) 3 : (char) 2;
                            if (richButtonStyle == null) {
                                richButtonStyle = new TL_keyboard.RichButtonStyle();
                            }
                            richButtonStyle.flags = 0;
                            richButtonStyle.bg_primary = c10 == 1;
                            richButtonStyle.bg_danger = c10 == 2;
                            richButtonStyle.bg_success = c10 == 3;
                            richButtonStyle.link = false;
                            pageButton.style = richButtonStyle;
                        }
                        o3Var.U2.N(false);
                        b2 b2Var2 = o3Var.F3;
                        if (b2Var2 != null) {
                            b2Var2.h();
                        }
                        o3Var.d3.onContentChanged();
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
                AndroidUtilities.cancelRunOnUIThread(qdVar);
                return true;
            }
            if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                this.c = false;
                richButton.setPressed(false);
                AndroidUtilities.cancelRunOnUIThread(qdVar);
                return true;
            }
        }
        return true;
    }
}
