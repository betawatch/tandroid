package qh;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.iw0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class r9 extends p {
    public final Path O1;
    public final /* synthetic */ ca P1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9(ca caVar, Activity activity, FrameLayout frameLayout, qv0 qv0Var, FrameLayout frameLayout2, oh.b bVar, org.telegram.ui.Components.ba baVar) {
        super(activity, frameLayout, qv0Var, frameLayout2, bVar, baVar);
        this.P1 = caVar;
        this.O1 = new Path();
    }

    @Override // qh.k
    public final boolean e() {
        ic icVar;
        if (MessagesController.getInstance(this.R).premiumFeaturesBlocked() || ((icVar = ic.w) != null && icVar.a == 2)) {
            return false;
        }
        int i10 = MessagesController.getInstance(this.R).storyCaptionLengthLimitPremium;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CaptionPremiumSubtitle", Math.round(i10 / MessagesController.getInstance(this.R).storyCaptionLengthLimitDefault), l.d.j(i10, "")));
        int indexOf = replaceTags.toString().indexOf("__");
        if (indexOf >= 0) {
            replaceTags.replace(indexOf, indexOf + 2, (CharSequence) "");
            int indexOf2 = replaceTags.toString().indexOf("__");
            if (indexOf2 >= 0) {
                replaceTags.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                replaceTags.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.gc, this.a)), indexOf, indexOf2, 33);
                replaceTags.setSpan(new fg.l0(this, 8), indexOf, indexOf2, 33);
            }
        }
        ic M = new qc(this.P1.i0, this.a).M(LocaleController.getString(R.string.CaptionPremiumTitle), replaceTags, R.raw.caption_limit);
        M.a = 2;
        M.j = 5000;
        M.k(false);
        return true;
    }

    @Override // qh.k
    public final boolean g() {
        return this.P1.o0.c();
    }

    @Override // qh.p
    public final int getTimelineHeight() {
        ma maVar;
        ca caVar = this.P1;
        if (caVar.V0 == null || (maVar = caVar.W0) == null || maVar.getVisibility() != 0) {
            return 0;
        }
        return caVar.W0.getTimelineHeight();
    }

    @Override // qh.k
    public final void h(org.telegram.ui.Components.fa faVar, Canvas canvas, RectF rectF, float f10, boolean z4, float f11, float f12, boolean z10) {
        if (canvas.isHardwareAccelerated()) {
            canvas.save();
            Path path = this.O1;
            path.rewind();
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            canvas.clipPath(path);
            canvas.translate(f11, f12);
            faVar.b(canvas, true);
            canvas.restore();
        }
    }

    @Override // qh.k
    public final void i(Bitmap bitmap) {
        this.P1.n.Z(bitmap, 12.0f);
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    @Override // qh.k
    public final boolean l(float f10, float f11) {
        ca caVar = this.P1;
        f9 f9Var = caVar.s1;
        if (f9Var != null && f9Var.O0 != null) {
            r9 r9Var = caVar.Z0;
            if (!r9Var.m0) {
                float x10 = r9Var.getX() + f10;
                float y10 = caVar.Z0.getY() + f11;
                float x11 = caVar.i0.getX() + x10;
                float y11 = caVar.i0.getY() + y10;
                float x12 = x11 - caVar.e0.getX();
                float y12 = y11 - caVar.e0.getY();
                for (int i10 = 0; i10 < caVar.s1.O0.getChildCount(); i10++) {
                    View childAt = caVar.s1.O0.getChildAt(i10);
                    if (childAt instanceof eg.j) {
                        tk0 selectionBounds = ((eg.j) childAt).getSelectionBounds();
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f12 = selectionBounds.a;
                        float f13 = selectionBounds.b;
                        rectF.set(f12, f13, selectionBounds.c + f12, selectionBounds.d + f13);
                        if (rectF.contains(x12, y12)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // qh.k
    public final void n() {
        iw0 iw0Var = this.P1.q0;
        if (iw0Var != null) {
            iw0Var.invalidate();
        }
    }

    @Override // qh.k
    public final void q(boolean z4) {
        boolean z10;
        s6 s6Var;
        ca caVar = this.P1;
        e5 e5Var = caVar.Y0;
        if (!caVar.K1 && !z4) {
            oh.t6 storiesController = MessagesController.getInstance(this.R).getStoriesController();
            int B = caVar.B();
            oh.n6 o10 = storiesController.o();
            if (o10 == null || !o10.a(storiesController.a, B) || ((s6Var = caVar.H1) != null && s6Var.g)) {
                z10 = true;
                e5Var.setShareEnabled(z10);
            }
        }
        z10 = false;
        e5Var.setShareEnabled(z10);
    }
}
