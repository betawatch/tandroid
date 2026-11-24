// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class zw0 extends FrameLayout {
    public final fm a;
    public final ImageView b;
    public final ImageView c;
    public final byte d;
    public boolean e;
    public boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public zw0(int i, wjb wjbVar, Context context) {
        super(context);
        this.f = false;
        this.d = i;
        if (i != 4) {
            setBackgroundDrawable(bkb.K0(wjbVar, false));
        }
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        zkb.s(imageView, bkb.I5, wjbVar, PorterDuff.Mode.MULTIPLY);
        addView(imageView, nme.e(56, 48, (k96.a0 ? 5 : 3) | 16));
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        zkb.s(imageView2, bkb.g7, wjbVar, PorterDuff.Mode.SRC_IN);
        addView(imageView2, nme.e(56, 48, (k96.a0 ? 3 : 5) | 16));
        fm fmVar = new fm(context);
        this.a = fmVar;
        fmVar.setLines(1);
        fmVar.setSingleLine(true);
        fmVar.setGravity(1);
        fmVar.setEllipsize(TextUtils.TruncateAt.END);
        if (i == 0 || i == 4) {
            zkb.X(fmVar, bkb.i5, wjbVar);
            fmVar.setTextSize(1, 16.0f);
            addView(fmVar, nme.e(-2, -2, (k96.a0 ? 5 : 3) | 16));
            return;
        }
        if (i == 1) {
            fmVar.setGravity(17);
            zkb.X(fmVar, bkb.i5, wjbVar);
            fmVar.setTextSize(1, 14.0f);
            fmVar.setTypeface(gl.o());
            addView(fmVar, nme.c(-1.0f, -1));
            return;
        }
        if (i == 2) {
            fmVar.setGravity(17);
            zkb.X(fmVar, bkb.Ii, wjbVar);
            fmVar.setTextSize(1, 14.0f);
            fmVar.setTypeface(gl.o());
            fmVar.setBackground(sjb.e(bkb.v0(bkb.Ei, wjbVar), 6.0f));
            addView(fmVar, nme.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        }
    }

    public final void a(CharSequence charSequence, int i, Drawable drawable, boolean z) {
        fm fmVar = this.a;
        fmVar.setText(charSequence);
        ImageView imageView = this.b;
        if (i == 0 && drawable == null) {
            imageView.setVisibility(4);
            fmVar.setPadding(gl.L(z ? 21.0f : 16.0f), 0, gl.L(z ? 21.0f : 16.0f), 0);
            return;
        }
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            imageView.setImageResource(i);
        }
        imageView.setVisibility(0);
        boolean z2 = k96.a0;
        if (z) {
            fmVar.setPadding(gl.L(z2 ? 21.0f : 72.0f), 0, gl.L(k96.a0 ? 72.0f : 21.0f), 0);
            imageView.setPadding(k96.a0 ? 0 : gl.L(5.0f), 0, k96.a0 ? gl.L(5.0f) : 5, 0);
        } else {
            fmVar.setPadding(gl.L(z2 ? 16.0f : 72.0f), 0, gl.L(k96.a0 ? 72.0f : 16.0f), 0);
            imageView.setPadding(0, 0, 0, 0);
        }
    }

    public ImageView getImageView() {
        return this.b;
    }

    public fm getTextView() {
        return this.a;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        byte b = this.d;
        int i3 = b == 2 ? 80 : 48;
        if (b == 0) {
            i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(i3), TLObject.FLAG_30));
    }

    public void setChecked(boolean z) {
        this.e = z;
        this.c.setImageResource(z ? R.drawable.checkbig : 0);
    }

    public void setGravity(int i) {
        this.a.setGravity(i);
    }

    public void setIconColor(int i) {
        this.b.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
    }

    public void setTextColor(int i) {
        this.a.setTextColor(i);
    }
}
