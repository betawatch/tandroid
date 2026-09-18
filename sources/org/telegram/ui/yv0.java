package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class yv0 extends org.telegram.ui.Components.vl0 {
    public final Context c;
    public final /* synthetic */ aw0 d;

    public yv0(aw0 aw0Var, Context context) {
        this.d = aw0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int b10 = c1Var.b();
        aw0 aw0Var = this.d;
        if (b10 == aw0Var.i0 || b10 == aw0Var.u0 || b10 == aw0Var.v0) {
            return !aw0Var.I;
        }
        if (!aw0Var.I || b10 < (i10 = aw0Var.n0) || b10 >= aw0Var.y + i10) {
            if (b10 != aw0Var.o0 && b10 != aw0Var.r0 && b10 != aw0Var.s0 && (aw0Var.N != 0 || b10 != aw0Var.t0)) {
                return false;
            }
        } else if (b10 - i10 < aw0Var.x) {
            return false;
        }
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.x0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        aw0 aw0Var = this.d;
        if (i10 == aw0Var.h0 || i10 == aw0Var.m0 || i10 == aw0Var.q0) {
            return 0;
        }
        if (i10 == aw0Var.l0) {
            return 1;
        }
        if (i10 == aw0Var.p0 || i10 == aw0Var.w0 || i10 == aw0Var.k0) {
            return 2;
        }
        if (i10 == aw0Var.o0) {
            return 3;
        }
        if (i10 == aw0Var.i0) {
            return 4;
        }
        if (i10 == aw0Var.j0) {
            return 7;
        }
        return (i10 == aw0Var.r0 || i10 == aw0Var.s0 || i10 == aw0Var.t0 || i10 == aw0Var.u0 || i10 == aw0Var.v0) ? 6 : 5;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        aw0 aw0Var = this.d;
        int i11 = aw0Var.N;
        boolean z10 = aw0Var.d0;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == aw0Var.h0) {
                m4Var.setText(LocaleController.getString(z10 ? aw0Var.z0 != null ? R.string.TodoEditTitle : R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i10 != aw0Var.m0) {
                if (i10 == aw0Var.q0) {
                    m4Var.setText(LocaleController.getString(R.string.Settings));
                    return;
                }
                return;
            } else if (i11 == 1) {
                m4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                return;
            } else {
                m4Var.setText(LocaleController.getString(z10 ? R.string.TodoItemsTitle : R.string.AnswerOptions2));
                return;
            }
        }
        if (i12 == 6) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            w8Var.setEnabled(!aw0Var.I);
            w8Var.getCheckBox().setAlpha(!aw0Var.I ? 1.0f : 0.6f);
            if (i10 == aw0Var.u0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), aw0Var.H, true);
                w8Var.e(null, true);
                return;
            }
            if (i10 == aw0Var.v0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), aw0Var.J, false);
                w8Var.e(null, true);
                return;
            }
            if (i10 == aw0Var.r0) {
                w8Var.f(LocaleController.getString(R.string.PollAnonymous), aw0Var.G, (aw0Var.s0 == -1 && aw0Var.t0 == -1) ? false : true);
                w8Var.e(null, true);
                return;
            } else if (i10 == aw0Var.s0) {
                w8Var.f(LocaleController.getString(R.string.PollMultiple), aw0Var.K, aw0Var.t0 != -1);
                w8Var.e(null, true);
                return;
            } else {
                if (i10 == aw0Var.t0) {
                    w8Var.f(LocaleController.getString(R.string.PollQuiz), aw0Var.L, false);
                    w8Var.e(null, i11 == 0);
                    return;
                }
                return;
            }
        }
        Context context = this.c;
        if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            r8Var.e(-1, org.telegram.ui.ActionBar.j6.q6);
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k7, false), mode));
            r8Var.n(LocaleController.getString(z10 ? R.string.TodoNewTask : R.string.AddAnOption), new org.telegram.ui.Components.pq(drawable, drawable2), false);
            return;
        }
        org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
        e9Var.setFixedSize(0);
        e9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
        if (i10 == aw0Var.k0) {
            e9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
            return;
        }
        if (i10 == aw0Var.w0) {
            e9Var.setFixedSize(12);
            e9Var.setText(null);
            return;
        }
        int i13 = aw0Var.n - aw0Var.y;
        if (i13 <= 0) {
            e9Var.setText(LocaleController.getString(z10 ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
        } else if (z10) {
            e9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i13));
        } else {
            e9Var.setText(LocaleController.formatString("AddAnOptionInfo", R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i13, new Object[0])));
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        aw0 aw0Var = this.d;
        boolean z10 = aw0Var.c0;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                view = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
            } else if (i10 == 2) {
                view = new org.telegram.ui.Cells.e9(context);
            } else if (i10 == 3) {
                View r8Var = new org.telegram.ui.Cells.r8(context);
                r8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view = r8Var;
            } else if (i10 == 4) {
                vv0 vv0Var = new vv0(this, context, z10 ? 1 : 0);
                vv0Var.d();
                vv0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                vv0Var.c(new org.telegram.ui.Components.qn(4, this, vv0Var));
                view = vv0Var;
            } else if (i10 == 6) {
                View w8Var = new org.telegram.ui.Cells.w8(context);
                w8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view = w8Var;
            } else if (i10 != 7) {
                xv0 xv0Var = new xv0(this, context, z10 ? 1 : 0, new k60(aw0Var, 21));
                xv0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                xv0Var.c(new org.telegram.ui.Components.qn(6, this, xv0Var));
                xv0Var.setShowNextButton(true);
                EditTextBoldCursor textView = xv0Var.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new wd(3, this, xv0Var));
                textView.setOnKeyListener(new vg(xv0Var, 2));
                view = xv0Var;
            } else {
                wv0 wv0Var = new wv0(this, context, z10 ? 1 : 0);
                wv0Var.d();
                wv0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                wv0Var.c(new org.telegram.ui.Components.qn(5, this, wv0Var));
                view = wv0Var;
            }
        } else {
            View m4Var = new org.telegram.ui.Cells.m4(this.c, org.telegram.ui.ActionBar.j6.L6, 21, 15, false, null);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            view = m4Var;
        }
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        aw0 aw0Var = this.d;
        boolean z10 = aw0Var.d0;
        int i10 = c1Var.f;
        View view = c1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
            d6Var.setTag(1);
            org.telegram.ui.Cells.c6 c6Var = d6Var.d;
            CharSequence charSequence = aw0Var.E;
            d6Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z10 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), false);
            d6Var.setTag(null);
            d6Var.setEnabled(!aw0Var.I);
            c6Var.setEnabled(true ^ aw0Var.I);
            c6Var.setTextColor(org.telegram.ui.ActionBar.j6.l1(aw0Var.I ? 0.6f : 1.0f, aw0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6)));
            aw0.c0(aw0Var, view, c1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.d6 d6Var2 = (org.telegram.ui.Cells.d6) view;
                d6Var2.setTag(1);
                CharSequence charSequence2 = aw0Var.F;
                d6Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                d6Var2.setTag(null);
                aw0.c0(aw0Var, view, c1Var.b());
                return;
            }
            return;
        }
        int b10 = c1Var.b();
        org.telegram.ui.Cells.d6 d6Var3 = (org.telegram.ui.Cells.d6) view;
        d6Var3.setTag(1);
        org.telegram.ui.Cells.c6 c6Var2 = d6Var3.d;
        int i11 = b10 - aw0Var.n0;
        boolean z11 = !aw0Var.I || i11 >= aw0Var.x;
        c6Var2.setEnabled(z11);
        c6Var2.setTextColor(org.telegram.ui.ActionBar.j6.l1(z11 ? 1.0f : 0.6f, aw0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6)));
        d6Var3.n(aw0Var.v[i11], LocaleController.getString(z10 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        d6Var3.setTag(null);
        ImageView imageView = d6Var3.f;
        if (imageView != null) {
            imageView.setVisibility(z11 ? 0 : 8);
        }
        ImageView imageView2 = d6Var3.h;
        if (imageView2 != null) {
            imageView2.setAlpha(z11 ? 1.0f : 0.45f);
        }
        if (!aw0Var.f0 && aw0Var.g0 == b10) {
            EditTextBoldCursor textView = d6Var3.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            aw0Var.f0 = false;
            aw0Var.g0 = -1;
        }
        aw0.c0(aw0Var, view, b10);
    }

    @Override // s4.h0
    public final void z(s4.c1 c1Var) {
        int i10 = c1Var.f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.d6) c1Var.a).getTextView();
            if (textView.isFocused()) {
                aw0 aw0Var = this.d;
                if (aw0Var.c0) {
                    org.telegram.ui.Components.zy0 zy0Var = aw0Var.Q;
                    if (zy0Var != null) {
                        zy0Var.f();
                    }
                    aw0Var.k0(true);
                }
                aw0Var.b0 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}
