package ph;

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
import org.telegram.ui.Components.sk0;
import org.telegram.ui.gw0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class t9 extends p {
    public final Path O1;
    public final /* synthetic */ da P1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(da daVar, Activity activity, FrameLayout frameLayout, qv0 qv0Var, FrameLayout frameLayout2, nh.b bVar, org.telegram.ui.Components.ba baVar) {
        super(activity, frameLayout, qv0Var, frameLayout2, bVar, baVar);
        this.P1 = daVar;
        this.O1 = new Path();
    }

    @Override // ph.k
    public final boolean e() {
        ic icVar;
        if (MessagesController.getInstance(this.R).premiumFeaturesBlocked() || ((icVar = ic.w) != null && icVar.a == 2)) {
            return false;
        }
        int i10 = MessagesController.getInstance(this.R).storyCaptionLengthLimitPremium;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CaptionPremiumSubtitle", Math.round(i10 / MessagesController.getInstance(this.R).storyCaptionLengthLimitDefault), kh.a2.j(i10, "")));
        int indexOf = replaceTags.toString().indexOf("__");
        if (indexOf >= 0) {
            replaceTags.replace(indexOf, indexOf + 2, (CharSequence) "");
            int indexOf2 = replaceTags.toString().indexOf("__");
            if (indexOf2 >= 0) {
                replaceTags.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                replaceTags.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, this.a)), indexOf, indexOf2, 33);
                replaceTags.setSpan(new eg.l0(this, 8), indexOf, indexOf2, 33);
            }
        }
        ic M = new qc(this.P1.i0, this.a).M(LocaleController.getString(R.string.CaptionPremiumTitle), replaceTags, R.raw.caption_limit);
        M.a = 2;
        M.j = 5000;
        M.k(false);
        return true;
    }

    @Override // ph.k
    public final boolean g() {
        return this.P1.o0.c();
    }

    @Override // ph.p
    public final int getTimelineHeight() {
        oa oaVar;
        da daVar = this.P1;
        if (daVar.V0 == null || (oaVar = daVar.W0) == null || oaVar.getVisibility() != 0) {
            return 0;
        }
        return daVar.W0.getTimelineHeight();
    }

    @Override // ph.k
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

    @Override // ph.k
    public final void i(Bitmap bitmap) {
        this.P1.n.Z(bitmap, 12.0f);
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    @Override // ph.k
    public final boolean l(float f10, float f11) {
        da daVar = this.P1;
        h9 h9Var = daVar.s1;
        if (h9Var != null && h9Var.O0 != null) {
            t9 t9Var = daVar.Z0;
            if (!t9Var.m0) {
                float x10 = t9Var.getX() + f10;
                float y10 = daVar.Z0.getY() + f11;
                float x11 = daVar.i0.getX() + x10;
                float y11 = daVar.i0.getY() + y10;
                float x12 = x11 - daVar.e0.getX();
                float y12 = y11 - daVar.e0.getY();
                for (int i10 = 0; i10 < daVar.s1.O0.getChildCount(); i10++) {
                    View childAt = daVar.s1.O0.getChildAt(i10);
                    if (childAt instanceof dg.j) {
                        sk0 selectionBounds = ((dg.j) childAt).getSelectionBounds();
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

    @Override // ph.k
    public final void n() {
        gw0 gw0Var = this.P1.q0;
        if (gw0Var != null) {
            gw0Var.invalidate();
        }
    }

    @Override // ph.k
    public final void q(boolean z4) {
        boolean z10;
        u6 u6Var;
        da daVar = this.P1;
        f5 f5Var = daVar.Y0;
        if (!daVar.K1 && !z4) {
            nh.t6 storiesController = MessagesController.getInstance(this.R).getStoriesController();
            int B = daVar.B();
            nh.n6 o10 = storiesController.o();
            if (o10 == null || !o10.a(storiesController.a, B) || ((u6Var = daVar.H1) != null && u6Var.g)) {
                z10 = true;
                f5Var.setShareEnabled(z10);
            }
        }
        z10 = false;
        f5Var.setShareEnabled(z10);
    }
}
