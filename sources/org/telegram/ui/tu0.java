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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class tu0 extends org.telegram.ui.Components.il0 {
    public final Context c;
    public final /* synthetic */ vu0 d;

    public tu0(vu0 vu0Var, Context context) {
        this.d = vu0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int i10;
        int b10 = n1Var.b();
        vu0 vu0Var = this.d;
        if (b10 == vu0Var.e0 || b10 == vu0Var.q0 || b10 == vu0Var.r0) {
            return !vu0Var.E;
        }
        if (!vu0Var.E || b10 < (i10 = vu0Var.j0) || b10 >= vu0Var.y + i10) {
            if (b10 != vu0Var.k0 && b10 != vu0Var.n0 && b10 != vu0Var.o0 && (vu0Var.J != 0 || b10 != vu0Var.p0)) {
                return false;
            }
        } else if (b10 - i10 < vu0Var.x) {
            return false;
        }
        return true;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.t0;
    }

    @Override // f2.p0
    public final int j(int i10) {
        vu0 vu0Var = this.d;
        if (i10 == vu0Var.d0 || i10 == vu0Var.i0 || i10 == vu0Var.m0) {
            return 0;
        }
        if (i10 == vu0Var.h0) {
            return 1;
        }
        if (i10 == vu0Var.l0 || i10 == vu0Var.s0 || i10 == vu0Var.g0) {
            return 2;
        }
        if (i10 == vu0Var.k0) {
            return 3;
        }
        if (i10 == vu0Var.e0) {
            return 4;
        }
        if (i10 == vu0Var.f0) {
            return 7;
        }
        return (i10 == vu0Var.n0 || i10 == vu0Var.o0 || i10 == vu0Var.p0 || i10 == vu0Var.q0 || i10 == vu0Var.r0) ? 6 : 5;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        vu0 vu0Var = this.d;
        int i11 = vu0Var.J;
        boolean z10 = vu0Var.Z;
        int i12 = n1Var.f;
        View view = n1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
            if (i10 == vu0Var.d0) {
                k4Var.setText(LocaleController.getString(z10 ? vu0Var.v0 != null ? R.string.TodoEditTitle : R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i10 != vu0Var.i0) {
                if (i10 == vu0Var.m0) {
                    k4Var.setText(LocaleController.getString(R.string.Settings));
                    return;
                }
                return;
            } else if (i11 == 1) {
                k4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                return;
            } else {
                k4Var.setText(LocaleController.getString(z10 ? R.string.TodoItemsTitle : R.string.AnswerOptions2));
                return;
            }
        }
        if (i12 == 6) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            q8Var.setEnabled(!vu0Var.E);
            q8Var.getCheckBox().setAlpha(!vu0Var.E ? 1.0f : 0.6f);
            if (i10 == vu0Var.q0) {
                q8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), vu0Var.D, true);
                q8Var.e(null, true);
                return;
            }
            if (i10 == vu0Var.r0) {
                q8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), vu0Var.F, false);
                q8Var.e(null, true);
                return;
            }
            if (i10 == vu0Var.n0) {
                q8Var.f(LocaleController.getString(R.string.PollAnonymous), vu0Var.C, (vu0Var.o0 == -1 && vu0Var.p0 == -1) ? false : true);
                q8Var.e(null, true);
                return;
            } else if (i10 == vu0Var.o0) {
                q8Var.f(LocaleController.getString(R.string.PollMultiple), vu0Var.G, vu0Var.p0 != -1);
                q8Var.e(null, true);
                return;
            } else {
                if (i10 == vu0Var.p0) {
                    q8Var.f(LocaleController.getString(R.string.PollQuiz), vu0Var.H, false);
                    q8Var.e(null, i11 == 0);
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
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
            m8Var.e(-1, org.telegram.ui.ActionBar.g6.q6);
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.k7, false), mode));
            m8Var.n(LocaleController.getString(z10 ? R.string.TodoNewTask : R.string.AddAnOption), new org.telegram.ui.Components.jq(drawable, drawable2), false);
            return;
        }
        org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
        y8Var.setFixedSize(0);
        y8Var.setBackground(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
        if (i10 == vu0Var.g0) {
            y8Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
            return;
        }
        if (i10 == vu0Var.s0) {
            y8Var.setFixedSize(12);
            y8Var.setText(null);
            return;
        }
        int i13 = vu0Var.n - vu0Var.y;
        if (i13 <= 0) {
            y8Var.setText(LocaleController.getString(z10 ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
        } else if (z10) {
            y8Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i13));
        } else {
            y8Var.setText(LocaleController.formatString("AddAnOptionInfo", R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i13, new Object[0])));
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        vu0 vu0Var = this.d;
        boolean z10 = vu0Var.Y;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                view = new org.telegram.ui.Cells.x6(context, (b) null);
            } else if (i10 == 2) {
                view = new org.telegram.ui.Cells.y8(context);
            } else if (i10 == 3) {
                View m8Var = new org.telegram.ui.Cells.m8(context);
                m8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                view = m8Var;
            } else if (i10 == 4) {
                qu0 qu0Var = new qu0(this, context, z10 ? 1 : 0);
                qu0Var.c();
                qu0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                qu0Var.b(new ag.c0(this, qu0Var, false, 11));
                view = qu0Var;
            } else if (i10 == 6) {
                View q8Var = new org.telegram.ui.Cells.q8(context);
                q8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                view = q8Var;
            } else if (i10 != 7) {
                su0 su0Var = new su0(this, context, z10 ? 1 : 0, new t50(vu0Var, 22));
                su0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                su0Var.b(new ag.c0(this, su0Var, false, 13));
                su0Var.setShowNextButton(true);
                EditTextBoldCursor textView = su0Var.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new rd(3, this, su0Var));
                textView.setOnKeyListener(new jg(su0Var, 2));
                view = su0Var;
            } else {
                ru0 ru0Var = new ru0(this, context, z10 ? 1 : 0);
                ru0Var.c();
                ru0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                ru0Var.b(new ag.c0(this, ru0Var, false, 12));
                view = ru0Var;
            }
        } else {
            View k4Var = new org.telegram.ui.Cells.k4(this.c, org.telegram.ui.ActionBar.g6.L6, 21, 15, false, null);
            k4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
            view = k4Var;
        }
        return th.m(view, view, -1, -2);
    }

    @Override // f2.p0
    public final void y(f2.n1 n1Var) {
        vu0 vu0Var = this.d;
        boolean z10 = vu0Var.Z;
        int i10 = n1Var.f;
        View view = n1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
            a6Var.setTag(1);
            bh.b bVar = a6Var.d;
            CharSequence charSequence = vu0Var.A;
            a6Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z10 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), false);
            a6Var.setTag(null);
            a6Var.setEnabled(!vu0Var.E);
            bVar.setEnabled(true ^ vu0Var.E);
            bVar.setTextColor(org.telegram.ui.ActionBar.g6.l1(vu0Var.E ? 0.6f : 1.0f, vu0Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6)));
            vu0.c0(vu0Var, view, n1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.a6 a6Var2 = (org.telegram.ui.Cells.a6) view;
                a6Var2.setTag(1);
                CharSequence charSequence2 = vu0Var.B;
                a6Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                a6Var2.setTag(null);
                vu0.c0(vu0Var, view, n1Var.b());
                return;
            }
            return;
        }
        int b10 = n1Var.b();
        org.telegram.ui.Cells.a6 a6Var3 = (org.telegram.ui.Cells.a6) view;
        a6Var3.setTag(1);
        bh.b bVar2 = a6Var3.d;
        int i11 = b10 - vu0Var.j0;
        boolean z11 = !vu0Var.E || i11 >= vu0Var.x;
        bVar2.setEnabled(z11);
        bVar2.setTextColor(org.telegram.ui.ActionBar.g6.l1(z11 ? 1.0f : 0.6f, vu0Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6)));
        a6Var3.n(vu0Var.v[i11], LocaleController.getString(z10 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        a6Var3.setTag(null);
        ImageView imageView = a6Var3.f;
        if (imageView != null) {
            imageView.setVisibility(z11 ? 0 : 8);
        }
        ImageView imageView2 = a6Var3.h;
        if (imageView2 != null) {
            imageView2.setAlpha(z11 ? 1.0f : 0.45f);
        }
        if (!vu0Var.b0 && vu0Var.c0 == b10) {
            EditTextBoldCursor textView = a6Var3.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            vu0Var.b0 = false;
            vu0Var.c0 = -1;
        }
        vu0.c0(vu0Var, view, b10);
    }

    @Override // f2.p0
    public final void z(f2.n1 n1Var) {
        int i10 = n1Var.f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.a6) n1Var.a).getTextView();
            if (textView.isFocused()) {
                vu0 vu0Var = this.d;
                if (vu0Var.Y) {
                    org.telegram.ui.Components.fy0 fy0Var = vu0Var.M;
                    if (fy0Var != null) {
                        fy0Var.f();
                    }
                    vu0Var.k0(true);
                }
                vu0Var.X = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}
