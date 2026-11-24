// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class zr1 extends jia {
    public final /* synthetic */ byte N0;
    public final Object O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr1(Context context, AtomicReference atomicReference) {
        super(context);
        this.N0 = (byte) 1;
        this.O0 = atomicReference;
    }

    @Override // jia
    public final boolean k(CharSequence charSequence) {
        jia jiaVar;
        switch (this.N0) {
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.O0;
                if (atomicReference != null && (jiaVar = (jia) atomicReference.get()) != null) {
                    jiaVar.k(charSequence);
                }
                return l(charSequence, false);
            default:
                return super.k(charSequence);
        }
    }

    @Override // jia, android.view.View
    public final void onAttachedToWindow() {
        switch (this.N0) {
            case 2:
                super.onAttachedToWindow();
                ((y08) this.O0).s.a();
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // jia, android.view.View
    public final void onDetachedFromWindow() {
        switch (this.N0) {
            case 2:
                super.onDetachedFromWindow();
                ((y08) this.O0).s.b();
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // jia, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.N0) {
            case 3:
                int rightDrawableX = getRightDrawableX();
                super.onDraw(canvas);
                if (rightDrawableX != getRightDrawableX()) {
                    ((ProfileActivity) this.O0).J3();
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // jia, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.N0) {
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.O0;
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (isFocusable()) {
                    if (profileActivity.h != null || profileActivity.n != null) {
                        StringBuilder sb = new StringBuilder(getText());
                        if (profileActivity.n != null) {
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(profileActivity.n);
                        }
                        if (profileActivity.h != null) {
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(profileActivity.h);
                        }
                        accessibilityNodeInfo.setText(sb);
                        break;
                    }
                }
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // jia
    public final void setTextColor(int i) {
        switch (this.N0) {
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.O0;
                profileActivity.J5 = i;
                super.setTextColor(bm2.f(profileActivity.G5, i, bkb.v0(bkb.F6, profileActivity.A0)));
                break;
            default:
                super.setTextColor(i);
                break;
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        jia jiaVar;
        byte b = this.N0;
        Object obj = this.O0;
        switch (b) {
            case 0:
                super.setTranslationY(f);
                mu1 mu1Var = (mu1) obj;
                if (this == mu1Var.S2[0] && mu1Var.W2[1] != null) {
                    if (mu1Var.c5 && f < 0.0f) {
                        mu1Var.O2.setTranslationY(f / 2.0f);
                        break;
                    } else {
                        mu1Var.O2.setTranslationY(0.0f);
                        break;
                    }
                }
                break;
            case 1:
                AtomicReference atomicReference = (AtomicReference) obj;
                if (atomicReference != null && (jiaVar = (jia) atomicReference.get()) != null) {
                    jiaVar.setTranslationY(f);
                }
                super.setTranslationY(f);
                break;
            default:
                super.setTranslationY(f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zr1(byte b, Context context, Object obj) {
        super(context);
        this.N0 = b;
        this.O0 = obj;
    }
}
