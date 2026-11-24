// default package

import android.animation.AnimatorSet;
import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.ui.DataAutoDownloadActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class v53 extends rj6 {
    public final /* synthetic */ int e;
    public final /* synthetic */ mhb f;
    public final /* synthetic */ ahb[] h;
    public final /* synthetic */ AnimatorSet[] n;
    public final /* synthetic */ DataAutoDownloadActivity r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v53(DataAutoDownloadActivity dataAutoDownloadActivity, Activity activity, int i, mhb mhbVar, ahb[] ahbVarArr, AnimatorSet[] animatorSetArr) {
        super(activity);
        this.r = dataAutoDownloadActivity;
        this.e = i;
        this.f = mhbVar;
        this.h = ahbVarArr;
        this.n = animatorSetArr;
        setWillNotDraw(false);
        TextView textView = new TextView(activity);
        this.a = textView;
        zkb.X(textView, bkb.i5, null);
        ug8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((k96.a0 ? 5 : 3) | 48);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        addView(textView, nme.d(-1, -1.0f, (k96.a0 ? 5 : 3) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        this.b = textView2;
        zkb.X(textView2, bkb.m5, null);
        ug8.w(textView2, 1, 16.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setGravity((k96.a0 ? 3 : 5) | 48);
        textView2.setImportantForAccessibility(2);
        addView(textView2, nme.d(-2, -1.0f, (k96.a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        ty0 ty0Var = new ty0(activity);
        this.c = ty0Var;
        ty0Var.setReportChanges(true);
        ty0Var.setDelegate(new gi3(this));
        ty0Var.setImportantForAccessibility(2);
        addView(ty0Var, nme.d(-1, 38.0f, 51, 6.0f, 36.0f, 6.0f, 0.0f));
        setImportantForAccessibility(1);
        setAccessibilityDelegate(ty0Var.getSeekBarAccessibilityDelegate());
    }
}
