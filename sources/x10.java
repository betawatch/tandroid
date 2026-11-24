// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class x10 extends a {
    public final /* synthetic */ byte G1;
    public final /* synthetic */ Object H1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x10(byte b, Context context, Object obj) {
        super(context, null);
        this.G1 = b;
        this.H1 = obj;
    }

    @Override // org.telegram.ui.ActionBar.a
    public final boolean A() {
        switch (this.G1) {
            case 2:
                rh3 rh3Var = ((cj3) this.H1).H3;
                return rh3Var != null && rh3Var.c();
            default:
                return super.A();
        }
    }

    @Override // org.telegram.ui.ActionBar.a
    public final void B(boolean z) {
        switch (this.G1) {
            case 2:
                rh3 rh3Var = ((cj3) this.H1).H3;
                if (rh3Var != null && rh3Var.c() && getBackButton() != null) {
                    getBackButton().animate().alpha(z ? 1.0f : 0.0f).start();
                }
                super.B(z);
                break;
            default:
                super.B(z);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a
    public final void H(int i, boolean z) {
        ImageView imageView;
        switch (this.G1) {
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.H1;
                super.H(i, z);
                if (!z) {
                    profileActivity.I5 = i;
                    profileActivity.V3();
                    ImageView imageView2 = profileActivity.Y0;
                    if (imageView2 != null) {
                        imageView2.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                    }
                }
                if (profileActivity.J0 && (imageView = this.e) != null) {
                    imageView.setColorFilter(i, PorterDuff.Mode.SRC_IN);
                    break;
                }
                break;
            default:
                super.H(i, z);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a
    public final boolean Q(View view) {
        switch (this.G1) {
            case 2:
                return super.Q(view) || view == ((cj3) this.H1).n0;
            default:
                return super.Q(view);
        }
    }

    @Override // org.telegram.ui.ActionBar.a
    public final void R(View[] viewArr, boolean[] zArr) {
        switch (this.G1) {
            case 2:
                super.R(viewArr, zArr);
                ((cj3) this.H1).h.a(true, true);
                break;
            default:
                super.R(viewArr, zArr);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.G1) {
            case 2:
                cj3 cj3Var = (cj3) this.H1;
                pi3 pi3Var = cj3Var.Y;
                if (pi3Var == null || pi3Var.getAlpha() <= 0.0f || !cj3Var.b.f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.a
    public final void n(boolean z) {
        switch (this.G1) {
            case 2:
                cj3 cj3Var = (cj3) this.H1;
                cj3Var.Y.r.getText().clear();
                if (z && cj3Var.Y.r.isFocused()) {
                    gl.t1(cj3Var.Y.r);
                }
                cj3Var.Y.r.clearFocus();
                cj3Var.Z.b(false);
                break;
            default:
                super.n(z);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.G1) {
            case 6:
                super.onLayout(z, i, i2, i3, i4);
                ProfileActivity profileActivity = (ProfileActivity) this.H1;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.h4(false);
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.G1) {
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.H1;
                oc6 oc6Var = profileActivity.Y;
                Rect rect = profileActivity.M2;
                oc6Var.getHitRect(rect);
                if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        byte b = this.G1;
        Object obj = this.H1;
        switch (b) {
            case 0:
                super.setAlpha(f);
                ((i20) obj).b.invalidate();
                break;
            case 1:
                x02 x02Var = (x02) obj;
                wz1 wz1Var = x02Var.A2;
                TextView textView = x02Var.g3;
                wz1 wz1Var2 = x02Var.u3;
                float alpha = getAlpha();
                super.setAlpha(f);
                if (alpha != f) {
                    if (textView != null) {
                        float f2 = 1.0f - f;
                        textView.setAlpha(f2);
                        textView.setVisibility(f2 > 0.0f ? 0 : 8);
                    }
                    x02Var.L0();
                    x02Var.b.invalidate();
                    if (wz1Var != null && wz1Var2 != null) {
                        Object tag = wz1Var.getTag();
                        p02 p02Var = x02Var.v2;
                        if (tag != null) {
                            if (p02Var == null) {
                                float f3 = f == 0.0f ? 1.0f : 0.0f;
                                if (wz1Var2.getAlpha() != f3) {
                                    wz1Var2.setAlpha(f3);
                                    break;
                                }
                            }
                        } else {
                            if (p02Var == null || p02Var.N()) {
                                wz1Var2.setAlpha(1.0f - f);
                                wz1Var2.setTranslationY(gl.L(44.0f) * f);
                            }
                            wz1Var.setTranslationY(gl.L(48.0f) * f);
                            break;
                        }
                    }
                }
                break;
            case 2:
            case 6:
            default:
                super.setAlpha(f);
                break;
            case 3:
                super.setAlpha(f);
                ((PhotoViewer) obj).f0.invalidate();
                break;
            case 4:
                super.setAlpha(f);
                ((gf8) obj).b.invalidate();
                break;
            case 5:
                if (getAlpha() != f) {
                    super.setAlpha(f);
                    ((jh8) obj).b.invalidate();
                    break;
                }
                break;
            case 7:
                super.setAlpha(f);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) obj;
                secretMediaViewer.r.setAlpha(f);
                secretMediaViewer.n.setAlpha(f);
                break;
        }
    }

    @Override // android.view.View
    public final void setTag(Object obj) {
        switch (this.G1) {
            case 5:
                super.setTag(obj);
                jh8 jh8Var = (jh8) this.H1;
                x10 x10Var = jh8Var.H1;
                if (x10Var != null && x10Var.getTag() != null) {
                    gl.m3(jh8Var, bm2.h(bkb.v0(bkb.g5, jh8Var.J0)) > 0.699999988079071d);
                    break;
                } else {
                    d dVar = jh8Var.l1;
                    if (dVar != null) {
                        gl.m3(jh8Var, dVar.isLightStatusBar());
                        break;
                    }
                }
                break;
            default:
                super.setTag(obj);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a, android.view.View
    public final void setTranslationY(float f) {
        View view;
        switch (this.G1) {
            case 2:
                if (f != getTranslationY() && (view = ((cj3) this.H1).fragmentView) != null) {
                    view.invalidate();
                }
                super.setTranslationY(f);
                break;
            default:
                super.setTranslationY(f);
                break;
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        switch (this.G1) {
            case 1:
                super.setVisibility(i);
                ((x02) this.H1).L0();
                break;
            default:
                super.setVisibility(i);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a
    public final void x() {
        switch (this.G1) {
            case 2:
                super.x();
                ((cj3) this.H1).h.a(false, true);
                break;
            default:
                super.x();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x10(gk7 gk7Var, Context context, wjb wjbVar, byte b) {
        super(context, wjbVar);
        this.G1 = b;
        this.H1 = gk7Var;
    }
}
