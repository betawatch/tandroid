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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class x20 extends a {
    public final /* synthetic */ byte G1;
    public final /* synthetic */ Object H1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x20(byte b, Context context, Object obj) {
        super(context, null);
        this.G1 = b;
        this.H1 = obj;
    }

    @Override // org.telegram.ui.ActionBar.a
    public final boolean A() {
        switch (this.G1) {
            case 2:
                dj3 dj3Var = ((nk3) this.H1).H3;
                return dj3Var != null && dj3Var.c();
            default:
                return super.A();
        }
    }

    @Override // org.telegram.ui.ActionBar.a
    public final void B(boolean z) {
        switch (this.G1) {
            case 2:
                dj3 dj3Var = ((nk3) this.H1).H3;
                if (dj3Var != null && dj3Var.c() && getBackButton() != null) {
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
                    profileActivity.N5 = i;
                    profileActivity.Z3();
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
                return super.Q(view) || view == ((nk3) this.H1).n0;
            default:
                return super.Q(view);
        }
    }

    @Override // org.telegram.ui.ActionBar.a
    public final void R(View[] viewArr, boolean[] zArr) {
        switch (this.G1) {
            case 2:
                super.R(viewArr, zArr);
                ((nk3) this.H1).h.a(true, true);
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
                nk3 nk3Var = (nk3) this.H1;
                zj3 zj3Var = nk3Var.Y;
                if (zj3Var == null || zj3Var.getAlpha() <= 0.0f || !nk3Var.b.f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.a
    public final void o(boolean z) {
        switch (this.G1) {
            case 2:
                nk3 nk3Var = (nk3) this.H1;
                nk3Var.Y.r.getText().clear();
                if (z && nk3Var.Y.r.isFocused()) {
                    gm.t1(nk3Var.Y.r);
                }
                nk3Var.Y.r.clearFocus();
                nk3Var.Z.b(false);
                break;
            default:
                super.o(z);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.G1) {
            case 6:
                super.onLayout(z, i, i2, i3, i4);
                ProfileActivity profileActivity = (ProfileActivity) this.H1;
                RectF rectF = ProfileActivity.e7;
                profileActivity.l4(false);
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
                ne6 ne6Var = profileActivity.Y;
                Rect rect = profileActivity.M2;
                ne6Var.getHitRect(rect);
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
                ((i30) obj).b.invalidate();
                break;
            case 1:
                i22 i22Var = (i22) obj;
                h12 h12Var = i22Var.A2;
                TextView textView = i22Var.g3;
                h12 h12Var2 = i22Var.u3;
                float alpha = getAlpha();
                super.setAlpha(f);
                if (alpha != f) {
                    if (textView != null) {
                        float f2 = 1.0f - f;
                        textView.setAlpha(f2);
                        textView.setVisibility(f2 > 0.0f ? 0 : 8);
                    }
                    i22Var.L0();
                    i22Var.b.invalidate();
                    if (h12Var != null && h12Var2 != null) {
                        Object tag = h12Var.getTag();
                        a22 a22Var = i22Var.v2;
                        if (tag != null) {
                            if (a22Var == null) {
                                float f3 = f == 0.0f ? 1.0f : 0.0f;
                                if (h12Var2.getAlpha() != f3) {
                                    h12Var2.setAlpha(f3);
                                    break;
                                }
                            }
                        } else {
                            if (a22Var == null || a22Var.M()) {
                                h12Var2.setAlpha(1.0f - f);
                                h12Var2.setTranslationY(gm.L(44.0f) * f);
                            }
                            h12Var.setTranslationY(gm.L(48.0f) * f);
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
                ((ih8) obj).b.invalidate();
                break;
            case 5:
                if (getAlpha() != f) {
                    super.setAlpha(f);
                    ((kj8) obj).b.invalidate();
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
                kj8 kj8Var = (kj8) this.H1;
                x20 x20Var = kj8Var.H1;
                if (x20Var != null && x20Var.getTag() != null) {
                    gm.l3(kj8Var, on2.h(cmb.v0(cmb.g5, kj8Var.J0)) > 0.699999988079071d);
                    break;
                } else {
                    d dVar = kj8Var.l1;
                    if (dVar != null) {
                        gm.l3(kj8Var, dVar.isLightStatusBar());
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
                if (f != getTranslationY() && (view = ((nk3) this.H1).fragmentView) != null) {
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
                ((i22) this.H1).L0();
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
                ((nk3) this.H1).h.a(false, true);
                break;
            default:
                super.x();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x20(jm7 jm7Var, Context context, ylb ylbVar, byte b) {
        super(context, ylbVar);
        this.G1 = b;
        this.H1 = jm7Var;
    }
}
