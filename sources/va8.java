// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Point;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class va8 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ PipRoundVideoView e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va8(PipRoundVideoView pipRoundVideoView, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = pipRoundVideoView;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        wl9 wl9Var = bkb.j3;
        if (wl9Var != null) {
            wl9Var.setAlpha((int) (getAlpha() * 255.0f));
            bkb.j3.setBounds(gl.L(1.0f), gl.L(2.0f), gl.L(125.0f), gl.L(125.0f));
            bkb.j3.draw(canvas);
            bkb.R1.setColor(bkb.w0(null, bkb.qa, false));
            bkb.R1.setAlpha((int) (getAlpha() * 255.0f));
            canvas.drawCircle(gl.L(63.0f), gl.L(63.0f), gl.L(59.5f), bkb.R1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.a = motionEvent.getRawX();
            this.b = motionEvent.getRawY();
            this.d = true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02b8 A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        boolean z;
        ArrayList arrayList;
        boolean z2;
        boolean z3;
        float f2;
        k27 k27Var;
        int i;
        if (!this.d && !this.c) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        float f3 = 1.0f;
        PipRoundVideoView pipRoundVideoView = this.e;
        if (action == 2) {
            float f4 = rawX - this.a;
            float f5 = rawY - this.b;
            if (this.d) {
                if (Math.abs(f4) >= gl.Z0(true, 0.3f) || Math.abs(f5) >= gl.Z0(false, 0.3f)) {
                    this.c = true;
                    this.d = false;
                    return true;
                }
            } else if (this.c) {
                WindowManager.LayoutParams layoutParams = pipRoundVideoView.w;
                int i2 = (int) (layoutParams.x + f4);
                layoutParams.x = i2;
                layoutParams.y = (int) (layoutParams.y + f5);
                int i3 = pipRoundVideoView.h / 2;
                int i4 = -i3;
                if (i2 >= i4) {
                    i4 = (gl.q.x - layoutParams.width) + i3;
                    if (i2 > i4) {
                        layoutParams.x = i4;
                    }
                    if (i2 >= 0) {
                        f3 = b00.A(i2, i3, 0.5f, 1.0f);
                    } else {
                        if (i2 > gl.q.x - layoutParams.width) {
                            f3 = de9.x((i2 - r11) + r10, i3, 0.5f, 1.0f);
                        }
                    }
                    if (pipRoundVideoView.a.getAlpha() != f3) {
                        pipRoundVideoView.a.setAlpha(f3);
                    }
                    WindowManager.LayoutParams layoutParams2 = pipRoundVideoView.w;
                    i = layoutParams2.y;
                    if (i >= 0) {
                        layoutParams2.y = 0;
                    } else {
                        int i5 = gl.q.y - layoutParams2.height;
                        if (i > i5) {
                            layoutParams2.y = i5;
                        }
                    }
                    pipRoundVideoView.x.updateViewLayout(pipRoundVideoView.a, layoutParams2);
                    this.a = rawX;
                    this.b = rawY;
                    return true;
                }
                layoutParams.x = i4;
                i2 = i4;
                if (i2 >= 0) {
                }
                if (pipRoundVideoView.a.getAlpha() != f3) {
                }
                WindowManager.LayoutParams layoutParams22 = pipRoundVideoView.w;
                i = layoutParams22.y;
                if (i >= 0) {
                }
                pipRoundVideoView.x.updateViewLayout(pipRoundVideoView.a, layoutParams22);
                this.a = rawX;
                this.b = rawY;
                return true;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.d && !this.c && (k27Var = MediaController.w().v0) != null) {
                if (MediaController.w().C()) {
                    MediaController.w().R(k27Var);
                } else {
                    MediaController.w().Q(k27Var, true);
                }
            }
            this.c = false;
            this.d = false;
            int b = PipRoundVideoView.b(0.0f, 0, pipRoundVideoView.h, true);
            int b2 = PipRoundVideoView.b(0.0f, 1, pipRoundVideoView.h, true);
            int b3 = PipRoundVideoView.b(0.0f, 0, pipRoundVideoView.n, false);
            int b4 = PipRoundVideoView.b(0.0f, 1, pipRoundVideoView.n, false);
            SharedPreferences.Editor edit = pipRoundVideoView.y.edit();
            int L = gl.L(20.0f);
            int abs = Math.abs(b - pipRoundVideoView.w.x);
            Property property = View.ALPHA;
            if (abs > L) {
                int i6 = pipRoundVideoView.w.x;
                f = 0.0f;
                if (i6 >= 0 || i6 <= (-pipRoundVideoView.h) / 4) {
                    if (Math.abs(b2 - i6) > L) {
                        int i7 = pipRoundVideoView.w.x;
                        Point point = gl.q;
                        f2 = 1.0f;
                        int i8 = point.x;
                        z3 = false;
                        int i9 = pipRoundVideoView.h;
                        if (i7 <= i8 - i9 || i7 >= i8 - ((i9 / 4) * 3)) {
                            if (pipRoundVideoView.a.getAlpha() != 1.0f) {
                                arrayList = new ArrayList();
                                if (pipRoundVideoView.w.x < 0) {
                                    arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "x", -pipRoundVideoView.h));
                                } else {
                                    arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "x", point.x));
                                }
                                z = true;
                                if (!z) {
                                    if (Math.abs(b3 - pipRoundVideoView.w.y) <= L || pipRoundVideoView.w.y <= a.getCurrentActionBarHeight()) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        edit.putInt("sidey", 0);
                                        arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "y", b3));
                                    } else if (Math.abs(b4 - pipRoundVideoView.w.y) <= L) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        edit.putInt("sidey", 1);
                                        arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "y", b4));
                                    } else {
                                        edit.putFloat("py", (pipRoundVideoView.w.y - b3) / (b4 - b3));
                                        edit.putInt("sidey", 2);
                                    }
                                    edit.commit();
                                }
                                if (arrayList != null) {
                                    return true;
                                }
                                if (pipRoundVideoView.E == null) {
                                    pipRoundVideoView.E = new DecelerateInterpolator();
                                }
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.setInterpolator(pipRoundVideoView.E);
                                animatorSet.setDuration(150L);
                                if (z) {
                                    z2 = true;
                                    arrayList.add(ObjectAnimator.ofFloat(pipRoundVideoView.a, (Property<va8, Float>) property, f));
                                    animatorSet.addListener(new wa8(pipRoundVideoView, (byte) 1));
                                } else {
                                    z2 = true;
                                }
                                animatorSet.playTogether(arrayList);
                                animatorSet.start();
                                return z2;
                            }
                            edit.putFloat("px", (pipRoundVideoView.w.x - b) / (b2 - b));
                            edit.putInt("sidex", 2);
                            arrayList = null;
                            z = z3;
                            if (!z) {
                            }
                            if (arrayList != null) {
                            }
                        }
                    } else {
                        z3 = false;
                        f2 = 1.0f;
                    }
                    arrayList = new ArrayList();
                    edit.putInt("sidex", 1);
                    if (pipRoundVideoView.a.getAlpha() != f2) {
                        va8 va8Var = pipRoundVideoView.a;
                        float[] fArr = new float[1];
                        fArr[z3 ? 1 : 0] = f2;
                        arrayList.add(ObjectAnimator.ofFloat(va8Var, (Property<va8, Float>) property, fArr));
                    }
                    arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "x", b2));
                    z = z3;
                    if (!z) {
                    }
                    if (arrayList != null) {
                    }
                }
            } else {
                f = 0.0f;
            }
            ArrayList arrayList2 = new ArrayList();
            edit.putInt("sidex", 0);
            if (pipRoundVideoView.a.getAlpha() != 1.0f) {
                arrayList2.add(ObjectAnimator.ofFloat(pipRoundVideoView.a, (Property<va8, Float>) property, 1.0f));
            }
            arrayList2.add(ObjectAnimator.ofInt(pipRoundVideoView, "x", b));
            arrayList = arrayList2;
            z = false;
            if (!z) {
            }
            if (arrayList != null) {
            }
        }
        return true;
    }
}
