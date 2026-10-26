package sg;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.pa;
import org.telegram.ui.Components.zq;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class e2 extends fi.d {
    public final pa k0;
    public final RectF l0;
    public int m0;
    public final p2 n0;
    public final u6 o0;
    public int p0;
    public boolean q0;

    public e2(p2 p2Var, ContextThemeWrapper contextThemeWrapper, u6 u6Var, la laVar) {
        super(contextThemeWrapper, u6Var, false);
        this.l0 = new RectF();
        this.p0 = 8;
        this.o0 = u6Var;
        this.n0 = p2Var;
        this.k0 = new pa(laVar, this, 0, true);
        setWillNotDraw(false);
        setTextColor(-1);
        setFlickeringLoading(true);
        this.d.x(AndroidUtilities.bold());
        removeView(this.r);
        setForeground(y6.Z(y6.o1(0.08f, -1), 8, 8));
        setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
    }

    @Override // fi.d, android.view.View
    public void onDraw(Canvas canvas) {
        boolean z10 = this.g0;
        RectF rectF = this.l0;
        if (z10) {
            float c10 = this.d.c() + getPaddingLeft() + getPaddingRight();
            rectF.set((getMeasuredWidth() - c10) / 2.0f, 0.0f, (getMeasuredWidth() + c10) / 2.0f, getMeasuredHeight());
        } else {
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        super.onDraw(canvas);
    }

    @Override // fi.d, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.q0) {
            i10 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) this.d.c()), TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        m2[] m2VarArr;
        p2 p2Var = this.n0;
        if (!p2Var.y || (m2VarArr = p2Var.H) == null || m2VarArr.length <= 0) {
            f7 = 0.0f;
        }
        super.setAlpha(f7);
    }

    public void setCancelState(boolean z10) {
        this.m0 = 2;
        i(LocaleController.getString(R.string.Cancel), z10, true);
    }

    public void setCutOutState(boolean z10) {
        this.m0 = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        zq zqVar = new zq(R.drawable.media_magic_cut, 0);
        zqVar.setSize(AndroidUtilities.dp(22.0f));
        zqVar.setTranslateX(AndroidUtilities.dp(1.0f));
        zqVar.setTranslateY(AndroidUtilities.dp(2.0f));
        zqVar.spaceScaleX = 1.2f;
        spannableStringBuilder.setSpan(zqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationCutObject));
        i(spannableStringBuilder, z10, true);
    }

    public void setEraseState(boolean z10) {
        this.m0 = 3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        zq zqVar = new zq(R.drawable.media_button_erase, 0);
        zqVar.setSize(AndroidUtilities.dp(20.0f));
        zqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(zqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationErase));
        i(spannableStringBuilder, z10, true);
    }

    public void setOutlineState(boolean z10) {
        this.m0 = 6;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        zq zqVar = new zq(R.drawable.media_sticker_stroke, 0);
        zqVar.setSize(AndroidUtilities.dp(20.0f));
        zqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(zqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationOutline));
        i(spannableStringBuilder, z10, true);
    }

    public void setRad(int i10) {
        this.p0 = i10;
        setForeground(y6.Z(y6.w0(y6.i6, this.o0), i10, i10));
    }

    public void setRestoreState(boolean z10) {
        this.m0 = 4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        zq zqVar = new zq(R.drawable.media_button_restore, 0);
        zqVar.setSize(AndroidUtilities.dp(20.0f));
        zqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(zqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationRestore));
        i(spannableStringBuilder, z10, true);
    }

    public void setUndoCutState(boolean z10) {
        this.m0 = 1;
    }

    public void setUndoState(boolean z10) {
        this.m0 = 5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        zq zqVar = new zq(R.drawable.photo_undo2, 0);
        zqVar.setSize(AndroidUtilities.dp(20.0f));
        zqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(zqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationUndo));
        i(spannableStringBuilder, z10, true);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setVisibility(8);
        } else {
            super.setVisibility(i10);
        }
    }
}
