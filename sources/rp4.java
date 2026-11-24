// default package

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rp4 extends s09 {
    public boolean r;
    public boolean s;
    public final qp4 w;
    public final qp4 x;
    public final /* synthetic */ FragmentContextView y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [qp4] */
    /* JADX WARN: Type inference failed for: r1v2, types: [qp4] */
    public rp4(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.y = fragmentContextView;
        final byte b = 0;
        this.w = new Runnable(this) { // from class: qp4
            public final /* synthetic */ rp4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                rp4 rp4Var = this.b;
                switch (b2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = rp4Var.y;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            if (fragmentContextView2.E.K(fragmentContextView2.P ? 15 : 29)) {
                                boolean z = fragmentContextView2.P;
                                p09 p09Var = fragmentContextView2.E;
                                if (z) {
                                    p09Var.H(0);
                                } else {
                                    p09Var.H(14);
                                }
                            }
                            fragmentContextView2.y.d();
                            cmb.E0().c(true);
                            fragmentContextView2.a.h(true);
                            break;
                        }
                        break;
                    default:
                        FragmentContextView fragmentContextView3 = rp4Var.y;
                        if (rp4Var.r && VoIPService.getSharedInstance() != null) {
                            rp4Var.r = false;
                            rp4Var.s = true;
                            fragmentContextView3.P = false;
                            gm.d3(rp4Var.w, 90L);
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
        this.x = new Runnable(this) { // from class: qp4
            public final /* synthetic */ rp4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                rp4 rp4Var = this.b;
                switch (b22) {
                    case 0:
                        FragmentContextView fragmentContextView2 = rp4Var.y;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            if (fragmentContextView2.E.K(fragmentContextView2.P ? 15 : 29)) {
                                boolean z = fragmentContextView2.P;
                                p09 p09Var = fragmentContextView2.E;
                                if (z) {
                                    p09Var.H(0);
                                } else {
                                    p09Var.H(14);
                                }
                            }
                            fragmentContextView2.y.d();
                            cmb.E0().c(true);
                            fragmentContextView2.a.h(true);
                            break;
                        }
                        break;
                    default:
                        FragmentContextView fragmentContextView3 = rp4Var.y;
                        if (rp4Var.r && VoIPService.getSharedInstance() != null) {
                            rp4Var.r = false;
                            rp4Var.s = true;
                            fragmentContextView3.P = false;
                            gm.d3(rp4Var.w, 90L);
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
        accessibilityNodeInfo.setText(jb6.M0(this.y.P ? 2131742914 : 2131742977, null));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.y;
        int i = fragmentContextView.U;
        if (i != 3 && i != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        qp4 qp4Var = this.w;
        qp4 qp4Var2 = this.x;
        if (sharedInstance == null) {
            gm.r(qp4Var2);
            gm.r(qp4Var);
            this.r = false;
            this.s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            gm.d3(qp4Var2, 300L);
            this.r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            gm.r(qp4Var);
            if (this.r) {
                gm.r(qp4Var2);
                this.r = false;
            } else if (this.s) {
                fragmentContextView.P = true;
                if (fragmentContextView.E.K(15)) {
                    boolean z = fragmentContextView.P;
                    p09 p09Var = fragmentContextView.E;
                    if (z) {
                        p09Var.H(0);
                    } else {
                        p09Var.H(14);
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
                cmb.E0().c(true);
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
