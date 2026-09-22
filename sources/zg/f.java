package zg;

import ai.e2;
import ai.j6;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import w7.x5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class f extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public final e a;
    public boolean b;
    public boolean c;
    public Utilities.Callback d;

    public f(Activity activity, e6 e6Var) {
        super(activity);
        e eVar = new e(this, activity);
        this.a = eVar;
        eVar.setHapticFeedbackEnabled(true);
        eVar.setImageResource(R.drawable.smiles_tab_clear);
        int i10 = i6.Re;
        eVar.setColorFilter(new PorterDuffColorFilter(e6Var != null ? e6Var.G0(i10) : i6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        eVar.setScaleType(ImageView.ScaleType.CENTER);
        eVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        eVar.setFocusable(true);
        eVar.setOnClickListener(new e2(28));
        addView(eVar, x5.e(36, 36, 17));
        int w02 = i6.w0(null, i6.i6, false);
        int dp = AndroidUtilities.dp(36.0f);
        int i11 = i6.d6;
        eVar.setBackground(i6.h0(dp, e6Var != null ? e6Var.G0(i11) : i6.w0(null, i11, false), w02));
        eVar.setOutlineProvider(new j6(18));
        eVar.setElevation(AndroidUtilities.dp(1.0f));
        eVar.setClipToOutline(true);
        setClickable(true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), TLObject.FLAG_30));
    }

    public void setOnBackspace(Utilities.Callback<Boolean> callback) {
        this.d = callback;
    }
}
