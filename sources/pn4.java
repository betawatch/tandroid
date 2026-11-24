// default package

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class pn4 extends ry8 {
    public boolean r;
    public boolean s;
    public final on4 w;
    public final on4 x;
    public final /* synthetic */ FragmentContextView y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [on4] */
    /* JADX WARN: Type inference failed for: r1v2, types: [on4] */
    public pn4(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.y = fragmentContextView;
        final byte b = 0;
        this.w = new Runnable(this) { // from class: on4
            public final /* synthetic */ pn4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                pn4 pn4Var = this.b;
                switch (b2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = pn4Var.y;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            if (fragmentContextView2.E.K(fragmentContextView2.P ? 15 : 29)) {
                                boolean z = fragmentContextView2.P;
                                oy8 oy8Var = fragmentContextView2.E;
                                if (z) {
                                    oy8Var.H(0);
                                } else {
                                    oy8Var.H(14);
                                }
                            }
                            fragmentContextView2.y.d();
                            bkb.E0().c(true);
                            fragmentContextView2.a.h(true);
                            break;
                        }
                        break;
                    default:
                        FragmentContextView fragmentContextView3 = pn4Var.y;
                        if (pn4Var.r && VoIPService.getSharedInstance() != null) {
                            pn4Var.r = false;
                            pn4Var.s = true;
                            fragmentContextView3.P = false;
                            gl.d3(pn4Var.w, 90L);
                            try {
                                fragmentContextView3.y.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.x = new Runnable(this) { // from class: on4
            public final /* synthetic */ pn4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                pn4 pn4Var = this.b;
                switch (b22) {
                    case 0:
                        FragmentContextView fragmentContextView2 = pn4Var.y;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            if (fragmentContextView2.E.K(fragmentContextView2.P ? 15 : 29)) {
                                boolean z = fragmentContextView2.P;
                                oy8 oy8Var = fragmentContextView2.E;
                                if (z) {
                                    oy8Var.H(0);
                                } else {
                                    oy8Var.H(14);
                                }
                            }
                            fragmentContextView2.y.d();
                            bkb.E0().c(true);
                            fragmentContextView2.a.h(true);
                            break;
                        }
                        break;
                    default:
                        FragmentContextView fragmentContextView3 = pn4Var.y;
                        if (pn4Var.r && VoIPService.getSharedInstance() != null) {
                            pn4Var.r = false;
                            pn4Var.s = true;
                            fragmentContextView3.P = false;
                            gl.d3(pn4Var.w, 90L);
                            try {
                                fragmentContextView3.y.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        };
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        accessibilityNodeInfo.setText(k96.M0(this.y.P ? 2131742988 : 2131743051, null));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.y;
        int i = fragmentContextView.U;
        if (i != 3 && i != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        on4 on4Var = this.w;
        on4 on4Var2 = this.x;
        if (sharedInstance == null) {
            gl.r(on4Var2);
            gl.r(on4Var);
            this.r = false;
            this.s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            gl.d3(on4Var2, 300L);
            this.r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            gl.r(on4Var);
            if (this.r) {
                gl.r(on4Var2);
                this.r = false;
            } else if (this.s) {
                fragmentContextView.P = true;
                if (fragmentContextView.E.K(15)) {
                    boolean z = fragmentContextView.P;
                    oy8 oy8Var = fragmentContextView.E;
                    if (z) {
                        oy8Var.H(0);
                    } else {
                        oy8Var.H(14);
                    }
                }
                fragmentContextView.y.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.y.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.s = false;
                bkb.E0().c(true);
                fragmentContextView.a.h(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
