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
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.nw0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class q9 extends p {
    public final Path O1;
    public final /* synthetic */ ba P1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(ba baVar, Activity activity, FrameLayout frameLayout, pv0 pv0Var, FrameLayout frameLayout2, oh.b bVar, org.telegram.ui.Components.ba baVar2) {
        super(activity, frameLayout, pv0Var, frameLayout2, bVar, baVar2);
        this.P1 = baVar;
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
        la laVar;
        ba baVar = this.P1;
        if (baVar.V0 == null || (laVar = baVar.W0) == null || laVar.getVisibility() != 0) {
            return 0;
        }
        return baVar.W0.getTimelineHeight();
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
        ba baVar = this.P1;
        e9 e9Var = baVar.s1;
        if (e9Var != null && e9Var.O0 != null) {
            q9 q9Var = baVar.Z0;
            if (!q9Var.m0) {
                float x10 = q9Var.getX() + f10;
                float y10 = baVar.Z0.getY() + f11;
                float x11 = baVar.i0.getX() + x10;
                float y11 = baVar.i0.getY() + y10;
                float x12 = x11 - baVar.e0.getX();
                float y12 = y11 - baVar.e0.getY();
                for (int i10 = 0; i10 < baVar.s1.O0.getChildCount(); i10++) {
                    View childAt = baVar.s1.O0.getChildAt(i10);
                    if (childAt instanceof eg.j) {
                        sk0 selectionBounds = ((eg.j) childAt).getSelectionBounds();
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
        nw0 nw0Var = this.P1.q0;
        if (nw0Var != null) {
            nw0Var.invalidate();
        }
    }

    @Override // qh.k
    public final void q(boolean z4) {
        boolean z10;
        r6 r6Var;
        ba baVar = this.P1;
        d5 d5Var = baVar.Y0;
        if (!baVar.K1 && !z4) {
            oh.t6 storiesController = MessagesController.getInstance(this.R).getStoriesController();
            int B = baVar.B();
            oh.n6 o10 = storiesController.o();
            if (o10 == null || !o10.a(storiesController.a, B) || ((r6Var = baVar.H1) != null && r6Var.g)) {
                z10 = true;
                d5Var.setShareEnabled(z10);
            }
        }
        z10 = false;
        d5Var.setShareEnabled(z10);
    }
}
