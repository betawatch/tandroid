// default package

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class up4 extends e29 {
    public boolean r;
    public boolean s;
    public final tp4 w;
    public final tp4 x;
    public final /* synthetic */ FragmentContextView y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [tp4] */
    /* JADX WARN: Type inference failed for: r1v2, types: [tp4] */
    public up4(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.y = fragmentContextView;
        final byte b = 0;
        this.w = new Runnable(this) { // from class: tp4
            public final /* synthetic */ up4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                up4 up4Var = this.b;
                switch (b2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = up4Var.y;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            if (fragmentContextView2.E.K(fragmentContextView2.P ? 15 : 29)) {
                                boolean z = fragmentContextView2.P;
                                b29 b29Var = fragmentContextView2.E;
                                if (z) {
                                    b29Var.H(0);
                                } else {
                                    b29Var.H(14);
                                }
                            }
                            fragmentContextView2.y.d();
                            aob.E0().c(true);
                            fragmentContextView2.a.h(true);
                            break;
                        }
                        break;
                    default:
                        FragmentContextView fragmentContextView3 = up4Var.y;
                        if (up4Var.r && VoIPService.getSharedInstance() != null) {
                            up4Var.r = false;
                            up4Var.s = true;
                            fragmentContextView3.P = false;
                            hl.d3(up4Var.w, 90L);
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
        this.x = new Runnable(this) { // from class: tp4
            public final /* synthetic */ up4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                up4 up4Var = this.b;
                switch (b22) {
                    case 0:
                        FragmentContextView fragmentContextView2 = up4Var.y;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            if (fragmentContextView2.E.K(fragmentContextView2.P ? 15 : 29)) {
                                boolean z = fragmentContextView2.P;
                                b29 b29Var = fragmentContextView2.E;
                                if (z) {
                                    b29Var.H(0);
                                } else {
                                    b29Var.H(14);
                                }
                            }
                            fragmentContextView2.y.d();
                            aob.E0().c(true);
                            fragmentContextView2.a.h(true);
                            break;
                        }
                        break;
                    default:
                        FragmentContextView fragmentContextView3 = up4Var.y;
                        if (up4Var.r && VoIPService.getSharedInstance() != null) {
                            up4Var.r = false;
                            up4Var.s = true;
                            fragmentContextView3.P = false;
                            hl.d3(up4Var.w, 90L);
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
        accessibilityNodeInfo.setText(ob6.M0(this.y.P ? 2131742882 : 2131742945, null));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.y;
        int i = fragmentContextView.U;
        if (i != 3 && i != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        tp4 tp4Var = this.w;
        tp4 tp4Var2 = this.x;
        if (sharedInstance == null) {
            hl.r(tp4Var2);
            hl.r(tp4Var);
            this.r = false;
            this.s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            hl.d3(tp4Var2, 300L);
            this.r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            hl.r(tp4Var);
            if (this.r) {
                hl.r(tp4Var2);
                this.r = false;
            } else if (this.s) {
                fragmentContextView.P = true;
                if (fragmentContextView.E.K(15)) {
                    boolean z = fragmentContextView.P;
                    b29 b29Var = fragmentContextView.E;
                    if (z) {
                        b29Var.H(0);
                    } else {
                        b29Var.H(14);
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
                aob.E0().c(true);
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
