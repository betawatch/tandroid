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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class rv0 extends org.telegram.ui.Components.ll0 {
    public final Context c;
    public final /* synthetic */ tv0 d;

    public rv0(tv0 tv0Var, Context context) {
        this.d = tv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int b10 = c1Var.b();
        tv0 tv0Var = this.d;
        if (b10 == tv0Var.i0 || b10 == tv0Var.u0 || b10 == tv0Var.v0) {
            return !tv0Var.I;
        }
        if (!tv0Var.I || b10 < (i10 = tv0Var.n0) || b10 >= tv0Var.y + i10) {
            if (b10 != tv0Var.o0 && b10 != tv0Var.r0 && b10 != tv0Var.s0 && (tv0Var.N != 0 || b10 != tv0Var.t0)) {
                return false;
            }
        } else if (b10 - i10 < tv0Var.x) {
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
        tv0 tv0Var = this.d;
        if (i10 == tv0Var.h0 || i10 == tv0Var.m0 || i10 == tv0Var.q0) {
            return 0;
        }
        if (i10 == tv0Var.l0) {
            return 1;
        }
        if (i10 == tv0Var.p0 || i10 == tv0Var.w0 || i10 == tv0Var.k0) {
            return 2;
        }
        if (i10 == tv0Var.o0) {
            return 3;
        }
        if (i10 == tv0Var.i0) {
            return 4;
        }
        if (i10 == tv0Var.j0) {
            return 7;
        }
        return (i10 == tv0Var.r0 || i10 == tv0Var.s0 || i10 == tv0Var.t0 || i10 == tv0Var.u0 || i10 == tv0Var.v0) ? 6 : 5;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        tv0 tv0Var = this.d;
        int i11 = tv0Var.N;
        boolean z10 = tv0Var.d0;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == tv0Var.h0) {
                m4Var.setText(LocaleController.getString(z10 ? tv0Var.z0 != null ? R.string.TodoEditTitle : R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i10 != tv0Var.m0) {
                if (i10 == tv0Var.q0) {
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
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            x8Var.setEnabled(!tv0Var.I);
            x8Var.getCheckBox().setAlpha(!tv0Var.I ? 1.0f : 0.6f);
            if (i10 == tv0Var.u0) {
                x8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), tv0Var.H, true);
                x8Var.e(null, true);
                return;
            }
            if (i10 == tv0Var.v0) {
                x8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), tv0Var.J, false);
                x8Var.e(null, true);
                return;
            }
            if (i10 == tv0Var.r0) {
                x8Var.f(LocaleController.getString(R.string.PollAnonymous), tv0Var.G, (tv0Var.s0 == -1 && tv0Var.t0 == -1) ? false : true);
                x8Var.e(null, true);
                return;
            } else if (i10 == tv0Var.s0) {
                x8Var.f(LocaleController.getString(R.string.PollMultiple), tv0Var.K, tv0Var.t0 != -1);
                x8Var.e(null, true);
                return;
            } else {
                if (i10 == tv0Var.t0) {
                    x8Var.f(LocaleController.getString(R.string.PollQuiz), tv0Var.L, false);
                    x8Var.e(null, i11 == 0);
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
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            s8Var.e(-1, org.telegram.ui.ActionBar.h6.q6);
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.k7, false), mode));
            s8Var.n(LocaleController.getString(z10 ? R.string.TodoNewTask : R.string.AddAnOption), new org.telegram.ui.Components.qq(drawable, drawable2), false);
            return;
        }
        org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
        f9Var.setFixedSize(0);
        f9Var.setBackground(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
        if (i10 == tv0Var.k0) {
            f9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
            return;
        }
        if (i10 == tv0Var.w0) {
            f9Var.setFixedSize(12);
            f9Var.setText(null);
            return;
        }
        int i13 = tv0Var.n - tv0Var.y;
        if (i13 <= 0) {
            f9Var.setText(LocaleController.getString(z10 ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
        } else if (z10) {
            f9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i13));
        } else {
            f9Var.setText(LocaleController.formatString("AddAnOptionInfo", R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i13, new Object[0])));
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        tv0 tv0Var = this.d;
        boolean z10 = tv0Var.c0;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                view = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
            } else if (i10 == 2) {
                view = new org.telegram.ui.Cells.f9(context);
            } else if (i10 == 3) {
                View s8Var = new org.telegram.ui.Cells.s8(context);
                s8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                view = s8Var;
            } else if (i10 == 4) {
                ov0 ov0Var = new ov0(this, context, z10 ? 1 : 0);
                ov0Var.d();
                ov0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                ov0Var.c(new org.telegram.ui.Components.rn(4, this, ov0Var));
                view = ov0Var;
            } else if (i10 == 6) {
                View x8Var = new org.telegram.ui.Cells.x8(context);
                x8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                view = x8Var;
            } else if (i10 != 7) {
                qv0 qv0Var = new qv0(this, context, z10 ? 1 : 0, new h60(tv0Var, 21));
                qv0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                qv0Var.c(new org.telegram.ui.Components.rn(6, this, qv0Var));
                qv0Var.setShowNextButton(true);
                EditTextBoldCursor textView = qv0Var.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new vd(3, this, qv0Var));
                textView.setOnKeyListener(new tg(qv0Var, 2));
                view = qv0Var;
            } else {
                pv0 pv0Var = new pv0(this, context, z10 ? 1 : 0);
                pv0Var.d();
                pv0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                pv0Var.c(new org.telegram.ui.Components.rn(5, this, pv0Var));
                view = pv0Var;
            }
        } else {
            View m4Var = new org.telegram.ui.Cells.m4(this.c, org.telegram.ui.ActionBar.h6.L6, 21, 15, false, null);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
            view = m4Var;
        }
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        tv0 tv0Var = this.d;
        boolean z10 = tv0Var.d0;
        int i10 = c1Var.f;
        View view = c1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
            d6Var.setTag(1);
            org.telegram.ui.Cells.c6 c6Var = d6Var.d;
            CharSequence charSequence = tv0Var.E;
            d6Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z10 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), false);
            d6Var.setTag(null);
            d6Var.setEnabled(!tv0Var.I);
            c6Var.setEnabled(true ^ tv0Var.I);
            c6Var.setTextColor(org.telegram.ui.ActionBar.h6.l1(tv0Var.I ? 0.6f : 1.0f, tv0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6)));
            tv0.c0(tv0Var, view, c1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.d6 d6Var2 = (org.telegram.ui.Cells.d6) view;
                d6Var2.setTag(1);
                CharSequence charSequence2 = tv0Var.F;
                d6Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                d6Var2.setTag(null);
                tv0.c0(tv0Var, view, c1Var.b());
                return;
            }
            return;
        }
        int b10 = c1Var.b();
        org.telegram.ui.Cells.d6 d6Var3 = (org.telegram.ui.Cells.d6) view;
        d6Var3.setTag(1);
        org.telegram.ui.Cells.c6 c6Var2 = d6Var3.d;
        int i11 = b10 - tv0Var.n0;
        boolean z11 = !tv0Var.I || i11 >= tv0Var.x;
        c6Var2.setEnabled(z11);
        c6Var2.setTextColor(org.telegram.ui.ActionBar.h6.l1(z11 ? 1.0f : 0.6f, tv0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6)));
        d6Var3.n(tv0Var.v[i11], LocaleController.getString(z10 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        d6Var3.setTag(null);
        ImageView imageView = d6Var3.f;
        if (imageView != null) {
            imageView.setVisibility(z11 ? 0 : 8);
        }
        ImageView imageView2 = d6Var3.h;
        if (imageView2 != null) {
            imageView2.setAlpha(z11 ? 1.0f : 0.45f);
        }
        if (!tv0Var.f0 && tv0Var.g0 == b10) {
            EditTextBoldCursor textView = d6Var3.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            tv0Var.f0 = false;
            tv0Var.g0 = -1;
        }
        tv0.c0(tv0Var, view, b10);
    }

    @Override // s4.h0
    public final void z(s4.c1 c1Var) {
        int i10 = c1Var.f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.d6) c1Var.a).getTextView();
            if (textView.isFocused()) {
                tv0 tv0Var = this.d;
                if (tv0Var.c0) {
                    org.telegram.ui.Components.my0 my0Var = tv0Var.Q;
                    if (my0Var != null) {
                        my0Var.f();
                    }
                    tv0Var.k0(true);
                }
                tv0Var.b0 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}
