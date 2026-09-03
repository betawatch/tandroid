package wh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import qh.d8;
import qh.u9;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class c0 extends View {
    public final RichMessageLayout.RichButton a;
    public final int b;
    public boolean c;
    public boolean d;
    public final d8 e;
    public final /* synthetic */ f0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(f0 f0Var, Context context, TL_keyboard.PageButton pageButton, int i10) {
        super(context);
        this.f = f0Var;
        this.b = i10;
        RichMessageLayout.RichButton createEditorPageButton = RichMessageLayout.createEditorPageButton(f0Var.n, l.d.c(32.0f, AndroidUtilities.displaySize.x, AndroidUtilities.dp(240.0f)), f0Var.r, pageButton, new u9(this, 28));
        this.a = createEditorPageButton;
        this.e = new d8(this, i10, 5);
        createEditorPageButton.width = createEditorPageButton.getPreferredWidth();
        setContentDescription(x5.l(pageButton.text));
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
        f0 f0Var;
        d0 d0Var;
        a aVar;
        int actionMasked = motionEvent.getActionMasked();
        d8 d8Var = this.e;
        RichMessageLayout.RichButton richButton = this.a;
        if (actionMasked == 0) {
            this.c = true;
            this.d = false;
            richButton.setPressed(true);
            AndroidUtilities.runOnUIThread(d8Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (actionMasked == 1) {
            boolean z4 = this.c && !this.d;
            this.c = false;
            richButton.setPressed(false);
            AndroidUtilities.cancelRunOnUIThread(d8Var);
            if (z4 && (d0Var = (f0Var = this.f).B) != null && (aVar = f0Var.a) != null) {
                r3 r3Var = ((j3) d0Var).a;
                TL_iv.PageBlock pageBlock = aVar.b;
                if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                    TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                    int i10 = this.b;
                    if (i10 >= 0 && i10 < pageblockbuttonrow.buttons.size()) {
                        d2 d2Var = r3Var.G3;
                        if (d2Var != null) {
                            d2Var.d();
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
                        r3Var.V2.N(false);
                        d2 d2Var2 = r3Var.G3;
                        if (d2Var2 != null) {
                            d2Var2.h();
                        }
                        r3Var.e3.onContentChanged();
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
                AndroidUtilities.cancelRunOnUIThread(d8Var);
                return true;
            }
            if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                this.c = false;
                richButton.setPressed(false);
                AndroidUtilities.cancelRunOnUIThread(d8Var);
                return true;
            }
        }
        return true;
    }
}
