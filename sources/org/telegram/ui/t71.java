package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class t71 extends FrameLayout {
    public final ImageView a;
    public final TextView b;
    public final TextView c;
    public final Switch d;
    public boolean e;

    public t71(Activity activity, boolean z4) {
        super(activity);
        this.e = false;
        ImageView imageView = new ImageView(activity);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, k7.c6.d(32, 32.0f, 0, 12.0f, 4.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        addView(linearLayout, k7.c6.d(-1, -2.0f, 0, 64.0f, 4.0f, 0.0f, 4.0f));
        TextView textView = new TextView(activity);
        this.b = textView;
        textView.setTextSize(2, 16.0f);
        textView.setGravity(3);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
        linearLayout.addView(textView, k7.c6.t(-1, -2, 0, 0, 0, z4 ? 64 : 0, 0));
        TextView textView2 = new TextView(activity);
        this.c = textView2;
        textView2.setTextSize(2, 13.0f);
        textView2.setGravity(3);
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.y6, false));
        linearLayout.addView(textView2, k7.c6.t(-1, -2, 0, 0, 4, z4 ? 64 : 0, 0));
        setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        if (z4) {
            Switch r22 = new Switch(activity, null);
            this.d = r22;
            r22.setDrawIconType(1);
            addView(r22, k7.c6.d(37, 40.0f, 21, 21.0f, 0.0f, 21.0f, 0.0f));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.e) {
            canvas.drawRect(AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        Switch r02 = this.d;
        if (r02 != null) {
            accessibilityNodeInfo.setClassName("android.widget.Switch");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(r02.h);
            StringBuilder sb = new StringBuilder();
            sb.append((Object) this.b.getText());
            sb.append("\n");
            sb.append((Object) this.c.getText());
            sb.append("\n");
            sb.append(LocaleController.getString(r02.h ? R.string.NotificationsOn : R.string.NotificationsOff));
            accessibilityNodeInfo.setText(sb.toString());
        }
    }
}
