// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class w71 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ Context a;
    public final /* synthetic */ y71 b;

    public w71(y71 y71Var, Context context) {
        this.b = y71Var;
        this.a = context;
    }

    public final z71 a(float f, float f2) {
        z71 z71Var;
        y71 y71Var = this.b;
        if (y71Var.n != null) {
            int i = y71Var.e;
            float measuredWidth = y71Var.getMeasuredWidth() / 7.0f;
            float L = gl.L(52.0f);
            int L2 = gl.L(44.0f) / 2;
            int i2 = 0;
            for (int i3 = 0; i3 < y71Var.d; i3++) {
                float f3 = (measuredWidth / 2.0f) + (i * measuredWidth);
                float L3 = (L / 2.0f) + (i2 * L) + gl.L(44.0f);
                float f4 = L2;
                if (f >= f3 - f4 && f <= f3 + f4 && f2 >= L3 - f4 && f2 <= L3 + f4 && (z71Var = (z71) y71Var.n.get(i3, null)) != null) {
                    return z71Var;
                }
                i++;
                if (i >= 7) {
                    i2++;
                    i = 0;
                }
            }
        }
        return null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        final z71 a;
        ui5 ui5Var;
        super.onLongPress(motionEvent);
        y71 y71Var = this.b;
        b81 b81Var = y71Var.y;
        if (b81Var.f0 != 0 || gl.O1() || (a = a(motionEvent.getX(), motionEvent.getY())) == null) {
            return;
        }
        final byte b = 0;
        try {
            y71Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        Bundle bundle = new Bundle();
        long j = b81Var.y;
        if (j > 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        bundle.putInt("start_from_date", a.h);
        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
        mu1 mu1Var = new mu1(bundle);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, b81Var.getResourceProvider(), b81Var.getParentActivity());
        zkb.h(bkb.F8, b81Var.getResourceProvider(), actionBarPopupWindow$ActionBarPopupWindowLayout);
        final byte b2 = 1;
        a8 a8Var = new a8(b81Var.getParentActivity(), true, false);
        a8Var.j(k96.M0(2131748873, null), R.drawable.msg_message, null);
        a8Var.setMinimumWidth(kk7.p2);
        a8Var.setOnClickListener(new View.OnClickListener(this) { // from class: u71
            public final /* synthetic */ w71 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ui5 ui5Var2;
                ui5 ui5Var3;
                ui5 ui5Var4;
                ui5 ui5Var5;
                byte b3 = b;
                z71 z71Var = a;
                w71 w71Var = this.b;
                switch (b3) {
                    case 0:
                        b81 b81Var2 = w71Var.b.y;
                        ui5Var2 = ((d) b81Var2).parentLayout;
                        if (ui5Var2 != null) {
                            ui5Var3 = ((d) b81Var2).parentLayout;
                            if (ui5Var3.getFragmentStack().size() >= 3) {
                                ui5Var4 = ((d) b81Var2).parentLayout;
                                List fragmentStack = ui5Var4.getFragmentStack();
                                ui5Var5 = ((d) b81Var2).parentLayout;
                                d dVar = (d) fragmentStack.get(ui5Var5.getFragmentStack().size() - 3);
                                if (dVar instanceof mu1) {
                                    gl.e3(new fv0(w71Var, (mu1) dVar, z71Var, (byte) 11), 300L);
                                }
                            }
                        }
                        b81Var2.finishPreviewFragment();
                        break;
                    default:
                        b81 b81Var3 = w71Var.b.y;
                        int i = z71Var.h;
                        b81Var3.R = i;
                        b81Var3.Q = i;
                        b81Var3.H = true;
                        b81Var3.A0();
                        b81Var3.r0();
                        b81Var3.finishPreviewFragment();
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var);
        if (b81Var.e0) {
            a8 a8Var2 = new a8(b81Var.getParentActivity(), false, false);
            a8Var2.j(k96.M0(2131745458, null), R.drawable.msg_select, null);
            a8Var2.setMinimumWidth(kk7.p2);
            a8Var2.setOnClickListener(new View.OnClickListener(this) { // from class: u71
                public final /* synthetic */ w71 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ui5 ui5Var2;
                    ui5 ui5Var3;
                    ui5 ui5Var4;
                    ui5 ui5Var5;
                    byte b3 = b2;
                    z71 z71Var = a;
                    w71 w71Var = this.b;
                    switch (b3) {
                        case 0:
                            b81 b81Var2 = w71Var.b.y;
                            ui5Var2 = ((d) b81Var2).parentLayout;
                            if (ui5Var2 != null) {
                                ui5Var3 = ((d) b81Var2).parentLayout;
                                if (ui5Var3.getFragmentStack().size() >= 3) {
                                    ui5Var4 = ((d) b81Var2).parentLayout;
                                    List fragmentStack = ui5Var4.getFragmentStack();
                                    ui5Var5 = ((d) b81Var2).parentLayout;
                                    d dVar = (d) fragmentStack.get(ui5Var5.getFragmentStack().size() - 3);
                                    if (dVar instanceof mu1) {
                                        gl.e3(new fv0(w71Var, (mu1) dVar, z71Var, (byte) 11), 300L);
                                    }
                                }
                            }
                            b81Var2.finishPreviewFragment();
                            break;
                        default:
                            b81 b81Var3 = w71Var.b.y;
                            int i = z71Var.h;
                            b81Var3.R = i;
                            b81Var3.Q = i;
                            b81Var3.H = true;
                            b81Var3.A0();
                            b81Var3.r0();
                            b81Var3.finishPreviewFragment();
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var2);
            a8 a8Var3 = new a8(b81Var.getParentActivity(), false, true);
            a8Var3.j(k96.M0(2131752077, null), R.drawable.msg_delete, null);
            a8Var3.setMinimumWidth(kk7.p2);
            a8Var3.setOnClickListener(new View.OnClickListener(this) { // from class: v71
                public final /* synthetic */ w71 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ui5 ui5Var2;
                    ui5 ui5Var3;
                    ui5 ui5Var4;
                    byte b3 = b;
                    w71 w71Var = this.b;
                    switch (b3) {
                        case 0:
                            b81 b81Var2 = w71Var.b.y;
                            ui5Var2 = ((d) b81Var2).parentLayout;
                            if (ui5Var2.getFragmentStack().size() >= 3) {
                                ui5Var3 = ((d) b81Var2).parentLayout;
                                List fragmentStack = ui5Var3.getFragmentStack();
                                ui5Var4 = ((d) b81Var2).parentLayout;
                                d dVar = (d) fragmentStack.get(ui5Var4.getFragmentStack().size() - 3);
                                if (dVar instanceof mu1) {
                                    ij.q(b81Var2, 1, b81Var2.getMessagesController().V1(Long.valueOf(b81Var2.y)), null, false, new tg2(w71Var, (mu1) dVar, false, (byte) 13), null);
                                }
                            }
                            b81Var2.finishPreviewFragment();
                            break;
                        default:
                            w71Var.b.y.finishPreviewFragment();
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var3);
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        b81Var.w = new sb((byte) 3, this.a, this);
        b81Var.w.setOnClickListener(new View.OnClickListener(this) { // from class: v71
            public final /* synthetic */ w71 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ui5 ui5Var2;
                ui5 ui5Var3;
                ui5 ui5Var4;
                byte b3 = b2;
                w71 w71Var = this.b;
                switch (b3) {
                    case 0:
                        b81 b81Var2 = w71Var.b.y;
                        ui5Var2 = ((d) b81Var2).parentLayout;
                        if (ui5Var2.getFragmentStack().size() >= 3) {
                            ui5Var3 = ((d) b81Var2).parentLayout;
                            List fragmentStack = ui5Var3.getFragmentStack();
                            ui5Var4 = ((d) b81Var2).parentLayout;
                            d dVar = (d) fragmentStack.get(ui5Var4.getFragmentStack().size() - 3);
                            if (dVar instanceof mu1) {
                                ij.q(b81Var2, 1, b81Var2.getMessagesController().V1(Long.valueOf(b81Var2.y)), null, false, new tg2(w71Var, (mu1) dVar, false, (byte) 13), null);
                            }
                        }
                        b81Var2.finishPreviewFragment();
                        break;
                    default:
                        w71Var.b.y.finishPreviewFragment();
                        break;
                }
            }
        });
        b81Var.w.setVisibility(8);
        b81Var.w.setFitsSystemWindows(true);
        ui5Var = ((d) b81Var).parentLayout;
        ui5Var.getOverlayContainerView().addView(b81Var.w, nme.c(-1.0f, -1));
        b81Var.w0();
        b81Var.presentFragmentAsPreviewWithMenu(mu1Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        ui5 ui5Var;
        ui5 ui5Var2;
        ui5 ui5Var3;
        ui5 ui5Var4;
        ui5 ui5Var5;
        z71 a;
        k27 k27Var;
        v39 v39Var;
        y71 y71Var = this.b;
        b81 b81Var = y71Var.y;
        ui5Var = ((d) b81Var).parentLayout;
        if (ui5Var != null) {
            if (((b81Var.f0 == 1 && y71Var.n != null) || b81Var.g0 != null) && (a = a(motionEvent.getX(), motionEvent.getY())) != null && (k27Var = a.a) != null && (v39Var = b81Var.N) != null) {
                if (b81Var.g0 != null) {
                    m8b orCreateStoryViewer = b81Var.getOrCreateStoryViewer();
                    Context context = y71Var.getContext();
                    k27 k27Var2 = a.a;
                    TL_stories.StoryItem storyItem = k27Var2.l;
                    int e1 = k27Var2.e1();
                    y1b y1bVar = b81Var.g0;
                    i4d i4dVar = b81Var.h0;
                    orCreateStoryViewer.h = y6c.t0;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(y1bVar.d));
                    orCreateStoryViewer.P0 = e1;
                    orCreateStoryViewer.K(context, storyItem, arrayList, 0, y1bVar, null, i4dVar, true);
                } else {
                    int e12 = k27Var.e1();
                    int i = a.c;
                    nfa nfaVar = (nfa) v39Var.b;
                    cfa[] cfaVarArr = nfaVar.w1;
                    int i2 = -1;
                    for (int i3 = 0; i3 < cfaVarArr[0].a.size(); i3++) {
                        if (((k27) cfaVarArr[0].a.get(i3)).e1() == e12) {
                            i2 = i3;
                        }
                    }
                    iea P = nfaVar.P(0);
                    if (i2 < 0 || P == null) {
                        nfaVar.v0(0, e12, i, true);
                    } else {
                        P.x.g1(i2, 0);
                    }
                    if (P != null) {
                        P.J = e12;
                        P.K = false;
                    }
                    b81Var.finishFragment();
                }
            }
            if (y71Var.n != null) {
                if (b81Var.H) {
                    z71 a2 = a(motionEvent.getX(), motionEvent.getY());
                    if (a2 != null) {
                        ValueAnimator valueAnimator = b81Var.S;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            b81Var.S = null;
                        }
                        int i4 = b81Var.Q;
                        if (i4 == 0 && b81Var.R == 0) {
                            int i5 = a2.h;
                            b81Var.R = i5;
                            b81Var.Q = i5;
                        } else {
                            int i6 = a2.h;
                            int i7 = b81Var.R;
                            if (i4 == i6) {
                                if (i7 == i6) {
                                    b81Var.R = 0;
                                    b81Var.Q = 0;
                                } else {
                                    b81Var.Q = i7;
                                }
                            } else if (i7 == i6) {
                                b81Var.R = i4;
                            } else if (i4 != i7) {
                                b81Var.R = i6;
                                b81Var.Q = i6;
                            } else if (i6 > i7) {
                                b81Var.R = i6;
                            } else {
                                b81Var.Q = i6;
                            }
                        }
                        b81Var.A0();
                        b81Var.r0();
                        return false;
                    }
                } else {
                    z71 a3 = a(motionEvent.getX(), motionEvent.getY());
                    if (a3 != null) {
                        ui5Var2 = ((d) b81Var).parentLayout;
                        if (ui5Var2 != null) {
                            ui5Var3 = ((d) b81Var).parentLayout;
                            if (ui5Var3.getFragmentStack().size() >= 2) {
                                ui5Var4 = ((d) b81Var).parentLayout;
                                List fragmentStack = ui5Var4.getFragmentStack();
                                ui5Var5 = ((d) b81Var).parentLayout;
                                d dVar = (d) fragmentStack.get(ui5Var5.getFragmentStack().size() - 2);
                                if (dVar instanceof mu1) {
                                    b81Var.finishFragment();
                                    ((mu1) dVar).a8(a3.h);
                                    return false;
                                }
                            }
                        }
                    }
                    if (a3 != null && b81Var.O != null) {
                        b81Var.finishFragment();
                        b81Var.O.a8(a3.h);
                    }
                }
            }
        }
        return false;
    }
}
