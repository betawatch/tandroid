// default package

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class v0 implements View.OnLongClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        byte b = this.a;
        final byte b2 = 0;
        final byte b3 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                z0 z0Var = (z0) obj;
                r rVar = ((a1) obj2).w;
                if (rVar != null) {
                    break;
                }
                break;
            case 1:
                j20 j20Var = (j20) obj2;
                float f = MediaController.z().r0;
                w7 w7Var = j20Var.Q1;
                w7Var.e(false, f);
                yob.h(aob.G8, (vnb) obj, w7Var);
                j20Var.W0(false);
                s7 s7Var = j20Var.O1;
                s7Var.setDimMenu(0.15f);
                s7Var.U(w7Var, null);
                uc7.f1().edit().putInt("speedhint", -15).apply();
                break;
            case 2:
                fu5 fu5Var = (fu5) obj2;
                ((wd3) obj).run();
                if (fu5Var.J) {
                    fu5Var.u();
                    break;
                }
                break;
            case 3:
                o68 o68Var = (o68) obj2;
                lcb lcbVar = (lcb) obj;
                u48 u48Var = o68Var.j3;
                if (u48Var != null) {
                    hl.r(u48Var);
                    o68Var.j3 = null;
                }
                xea.G(true);
                kg5 kg5Var = o68Var.r0;
                if (kg5Var != null) {
                    kg5Var.f(true);
                }
                i49 i49Var = o68Var.b3;
                if (i49Var == null) {
                    i49 i49Var2 = new i49(2, o68Var.m2, new pu0(o68Var.l0, (byte) 7), o68Var.getContext(), LaunchActivity.Q());
                    o68Var.b3 = i49Var2;
                    i49Var2.setPadding(0, 0, 0, hl.L(22.0f));
                    o68Var.addView(o68Var.b3, o68Var.getChildCount() - 1, tre.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    o68Var.b3.setVisibility(8);
                    o68Var.b3.setDelegate(new t58(o68Var));
                    o68Var.b3.m(null, null, true);
                } else {
                    o68Var.bringChildToFront(i49Var);
                    o68Var.b3.k();
                }
                o68Var.b3.setFragment(LaunchActivity.Q());
                lcbVar.s.dispatchTouchEvent(hl.R());
                o68Var.W0(true);
                break;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                x53 x53Var = (x53) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                r47 r47Var = photoViewer.S4;
                if (r47Var != null) {
                    if (hl.g(r47Var.T0)) {
                        new d31(o11.a(photoViewer.F), x53Var).k(false).j();
                    }
                    break;
                }
                break;
            case 5:
                final ProfileActivity profileActivity = (ProfileActivity) obj2;
                ImageView imageView = (ImageView) obj;
                RectF rectF = ProfileActivity.Z6;
                n8 b4 = fd0.b(profileActivity, imageView, profileActivity.a(), profileActivity.g1, profileActivity.A0);
                if (b4 != null) {
                    b4.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: qp8
                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            byte b5 = b2;
                            ProfileActivity profileActivity2 = profileActivity;
                            switch (b5) {
                                case 0:
                                    RectF rectF2 = ProfileActivity.Z6;
                                    profileActivity2.Q1(0.0f);
                                    break;
                                default:
                                    RectF rectF3 = ProfileActivity.Z6;
                                    profileActivity2.Q1(0.0f);
                                    break;
                            }
                        }
                    });
                    profileActivity.x0 = imageView;
                    profileActivity.Q1(0.3f);
                    UndoView undoView = profileActivity.M;
                    if (undoView != null) {
                        undoView.d(1, true);
                    }
                    break;
                }
                break;
            case 6:
                final ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                View view2 = (View) obj;
                RectF rectF2 = ProfileActivity.Z6;
                n8 b5 = fd0.b(profileActivity2, view2, profileActivity2.a(), profileActivity2.g1, profileActivity2.A0);
                if (b5 != null) {
                    b5.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: qp8
                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            byte b52 = b3;
                            ProfileActivity profileActivity22 = profileActivity2;
                            switch (b52) {
                                case 0:
                                    RectF rectF22 = ProfileActivity.Z6;
                                    profileActivity22.Q1(0.0f);
                                    break;
                                default:
                                    RectF rectF3 = ProfileActivity.Z6;
                                    profileActivity22.Q1(0.0f);
                                    break;
                            }
                        }
                    });
                    profileActivity2.x0 = view2;
                    profileActivity2.Q1(0.3f);
                    UndoView undoView2 = profileActivity2.M;
                    if (undoView2 != null) {
                        undoView2.d(1, true);
                    }
                    break;
                }
                break;
            default:
                f1b f1bVar = (f1b) obj2;
                o46 o46Var = (o46) obj;
                g1b g1bVar = f1bVar.d;
                sk4 sk4Var = f1bVar.a;
                if (sk4Var.c) {
                    g1bVar.f();
                    ArrayList arrayList = g1bVar.n;
                    pf0 pf0Var = g1bVar.c;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((f1b) arrayList.get(i)).a.setChecked(false);
                        ((f1b) arrayList.get(i)).b.n = false;
                        if (g1bVar.r.c > 0 && i < pf0Var.d.size()) {
                            ((o46) pf0Var.d.get(i)).n = false;
                        }
                    }
                    sk4Var.setChecked(true);
                    o46Var.n = true;
                    g1bVar.b.z();
                    if (g1bVar.r.c > 0) {
                        ((o46) pf0Var.d.get(f1bVar.c)).n = true;
                        pf0Var.z();
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
