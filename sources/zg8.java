// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class zg8 extends FrameLayout {
    public final /* synthetic */ byte a = 0;
    public final ah8 b;

    public zg8(Context context, wjb wjbVar) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        addView(linearLayout, nme.e(-1, -2, 80));
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        zkb.Y(textView, zkb.g(bkb.F6, 100), wjbVar);
        textView.setTextSize(1, 13.0f);
        de9.q(textView, 17, null, 2131743617);
        linearLayout.addView(textView, nme.t(-1, -2, 0, 16, 17, 17, 16));
        ah8 ah8Var = new ah8(wjbVar, context, false);
        this.b = ah8Var;
        String M0 = k96.M0(2131743618, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").setSpan(new cm2(0, context.getDrawable(R.drawable.msg_premium_normal)), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) M0);
        ah8Var.f.setText(spannableStringBuilder);
        linearLayout.addView(ah8Var, nme.t(-1, 48, 0, 16, 0, 16, 16));
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        yg8 yg8Var;
        yg8 yg8Var2;
        switch (this.a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                ah8 ah8Var = this.b;
                CharSequence text = (!ah8Var.r || (yg8Var2 = ah8Var.h) == null) ? null : yg8Var2.getText();
                if (text == null && (yg8Var = ah8Var.f) != null) {
                    text = yg8Var.getText();
                }
                if (text != null) {
                    accessibilityNodeInfo.setText(text);
                    if (getContentDescription() == null) {
                        accessibilityNodeInfo.setContentDescription(text);
                        break;
                    }
                }
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg8(ah8 ah8Var, Context context) {
        super(context);
        this.b = ah8Var;
    }
}
