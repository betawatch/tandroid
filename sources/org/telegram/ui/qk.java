package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class qk extends org.telegram.ui.ActionBar.m5 {
    public final /* synthetic */ int M0;
    public final Object N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qk(int i7, Context context, Object obj) {
        super(context);
        this.M0 = i7;
        this.N0 = obj;
    }

    @Override // org.telegram.ui.ActionBar.m5
    public boolean k(CharSequence charSequence) {
        org.telegram.ui.ActionBar.m5 m5Var;
        switch (this.M0) {
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.N0;
                if (atomicReference != null && (m5Var = (org.telegram.ui.ActionBar.m5) atomicReference.get()) != null) {
                    m5Var.k(charSequence);
                }
                return l(charSequence, false);
            default:
                return super.k(charSequence);
        }
    }

    @Override // org.telegram.ui.ActionBar.m5, android.view.View
    public void onAttachedToWindow() {
        switch (this.M0) {
            case 2:
                super.onAttachedToWindow();
                ((im0) this.N0).s.a();
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m5, android.view.View
    public void onDetachedFromWindow() {
        switch (this.M0) {
            case 2:
                super.onDetachedFromWindow();
                ((im0) this.N0).s.b();
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m5, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.M0) {
            case 3:
                int rightDrawableX = getRightDrawableX();
                super.onDraw(canvas);
                if (rightDrawableX != getRightDrawableX()) {
                    ((ProfileActivity) this.N0).t5();
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m5, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.M0) {
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.N0;
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (isFocusable()) {
                    if (profileActivity.h != null || profileActivity.n != null) {
                        StringBuilder sb2 = new StringBuilder(getText());
                        if (profileActivity.n != null) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(profileActivity.n);
                        }
                        if (profileActivity.h != null) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(profileActivity.h);
                        }
                        accessibilityNodeInfo.setText(sb2);
                        break;
                    }
                }
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m5
    public void setTextColor(int i7) {
        switch (this.M0) {
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.N0;
                profileActivity.F5 = i7;
                super.setTextColor(i0.a.f(profileActivity.C5, i7, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, profileActivity.z0)));
                break;
            default:
                super.setTextColor(i7);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        org.telegram.ui.ActionBar.m5 m5Var;
        switch (this.M0) {
            case 0:
                super.setTranslationY(f10);
                cn cnVar = (cn) this.N0;
                if (this == cnVar.R2[0] && cnVar.V2[1] != null) {
                    if (cnVar.a5 && f10 < 0.0f) {
                        cnVar.N2.setTranslationY(f10 / 2.0f);
                        break;
                    } else {
                        cnVar.N2.setTranslationY(0.0f);
                        break;
                    }
                }
                break;
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.N0;
                if (atomicReference != null && (m5Var = (org.telegram.ui.ActionBar.m5) atomicReference.get()) != null) {
                    m5Var.setTranslationY(f10);
                }
                super.setTranslationY(f10);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk(Context context, AtomicReference atomicReference) {
        super(context);
        this.M0 = 1;
        this.N0 = atomicReference;
    }
}
