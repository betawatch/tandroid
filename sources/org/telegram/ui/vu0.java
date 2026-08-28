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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vu0 extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public final /* synthetic */ xu0 d;

    public vu0(xu0 xu0Var, Context context) {
        this.d = xu0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9;
        int b10 = q1Var.b();
        xu0 xu0Var = this.d;
        if (b10 == xu0Var.e0 || b10 == xu0Var.q0 || b10 == xu0Var.r0) {
            return !xu0Var.E;
        }
        if (!xu0Var.E || b10 < (i9 = xu0Var.j0) || b10 >= xu0Var.y + i9) {
            if (b10 != xu0Var.k0 && b10 != xu0Var.n0 && b10 != xu0Var.o0 && (xu0Var.J != 0 || b10 != xu0Var.p0)) {
                return false;
            }
        } else if (b10 - i9 < xu0Var.x) {
            return false;
        }
        return true;
    }

    @Override // f2.r0
    public final int h() {
        return this.d.t0;
    }

    @Override // f2.r0
    public final int j(int i9) {
        xu0 xu0Var = this.d;
        if (i9 == xu0Var.d0 || i9 == xu0Var.i0 || i9 == xu0Var.m0) {
            return 0;
        }
        if (i9 == xu0Var.h0) {
            return 1;
        }
        if (i9 == xu0Var.l0 || i9 == xu0Var.s0 || i9 == xu0Var.g0) {
            return 2;
        }
        if (i9 == xu0Var.k0) {
            return 3;
        }
        if (i9 == xu0Var.e0) {
            return 4;
        }
        if (i9 == xu0Var.f0) {
            return 7;
        }
        return (i9 == xu0Var.n0 || i9 == xu0Var.o0 || i9 == xu0Var.p0 || i9 == xu0Var.q0 || i9 == xu0Var.r0) ? 6 : 5;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        xu0 xu0Var = this.d;
        int i10 = xu0Var.J;
        boolean z10 = xu0Var.Z;
        int i11 = q1Var.f;
        View view = q1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i9 == xu0Var.d0) {
                m4Var.setText(LocaleController.getString(z10 ? xu0Var.v0 != null ? R.string.TodoEditTitle : R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i9 != xu0Var.i0) {
                if (i9 == xu0Var.m0) {
                    m4Var.setText(LocaleController.getString(R.string.Settings));
                    return;
                }
                return;
            } else if (i10 == 1) {
                m4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                return;
            } else {
                m4Var.setText(LocaleController.getString(z10 ? R.string.TodoItemsTitle : R.string.AnswerOptions2));
                return;
            }
        }
        if (i11 == 6) {
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            t8Var.setEnabled(!xu0Var.E);
            t8Var.getCheckBox().setAlpha(!xu0Var.E ? 1.0f : 0.6f);
            if (i9 == xu0Var.q0) {
                t8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), xu0Var.D, true);
                t8Var.e(null, true);
                return;
            }
            if (i9 == xu0Var.r0) {
                t8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), xu0Var.F, false);
                t8Var.e(null, true);
                return;
            }
            if (i9 == xu0Var.n0) {
                t8Var.f(LocaleController.getString(R.string.PollAnonymous), xu0Var.C, (xu0Var.o0 == -1 && xu0Var.p0 == -1) ? false : true);
                t8Var.e(null, true);
                return;
            } else if (i9 == xu0Var.o0) {
                t8Var.f(LocaleController.getString(R.string.PollMultiple), xu0Var.G, xu0Var.p0 != -1);
                t8Var.e(null, true);
                return;
            } else {
                if (i9 == xu0Var.p0) {
                    t8Var.f(LocaleController.getString(R.string.PollQuiz), xu0Var.H, false);
                    t8Var.e(null, i10 == 0);
                    return;
                }
                return;
            }
        }
        Context context = this.c;
        if (i11 != 2) {
            if (i11 != 3) {
                return;
            }
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            p8Var.e(-1, org.telegram.ui.ActionBar.f6.q6);
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.k7, false), mode));
            p8Var.n(LocaleController.getString(z10 ? R.string.TodoNewTask : R.string.AddAnOption), new org.telegram.ui.Components.fq(drawable, drawable2), false);
            return;
        }
        org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
        b9Var.setFixedSize(0);
        b9Var.setBackground(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.b7));
        if (i9 == xu0Var.g0) {
            b9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
            return;
        }
        if (i9 == xu0Var.s0) {
            b9Var.setFixedSize(12);
            b9Var.setText(null);
            return;
        }
        int i12 = xu0Var.n - xu0Var.y;
        if (i12 <= 0) {
            b9Var.setText(LocaleController.getString(z10 ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
        } else if (z10) {
            b9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i12));
        } else {
            b9Var.setText(LocaleController.formatString("AddAnOptionInfo", R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i12, new Object[0])));
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        xu0 xu0Var = this.d;
        boolean z10 = xu0Var.Y;
        if (i9 != 0) {
            Context context = this.c;
            if (i9 == 1) {
                view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
            } else if (i9 == 2) {
                view = new org.telegram.ui.Cells.b9(context);
            } else if (i9 == 3) {
                View p8Var = new org.telegram.ui.Cells.p8(context);
                p8Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                view = p8Var;
            } else if (i9 == 4) {
                su0 su0Var = new su0(this, context, z10 ? 1 : 0);
                su0Var.c();
                su0Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                su0Var.b(new fh.t4(this, su0Var, false, 10));
                view = su0Var;
            } else if (i9 == 6) {
                View t8Var = new org.telegram.ui.Cells.t8(context);
                t8Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                view = t8Var;
            } else if (i9 != 7) {
                uu0 uu0Var = new uu0(this, context, z10 ? 1 : 0, new q50(xu0Var, 22));
                uu0Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                uu0Var.b(new fh.t4(this, uu0Var, false, 12));
                uu0Var.setShowNextButton(true);
                EditTextBoldCursor textView = uu0Var.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new td(3, this, uu0Var));
                textView.setOnKeyListener(new kg(uu0Var, 2));
                view = uu0Var;
            } else {
                tu0 tu0Var = new tu0(this, context, z10 ? 1 : 0);
                tu0Var.c();
                tu0Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                tu0Var.b(new fh.t4(this, tu0Var, false, 11));
                view = tu0Var;
            }
        } else {
            View m4Var = new org.telegram.ui.Cells.m4(this.c, org.telegram.ui.ActionBar.f6.L6, 21, 15, false, null);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
            view = m4Var;
        }
        return j3.r0.s(view, view, -1, -2);
    }

    @Override // f2.r0
    public final void y(f2.q1 q1Var) {
        xu0 xu0Var = this.d;
        boolean z10 = xu0Var.Z;
        int i9 = q1Var.f;
        View view = q1Var.a;
        if (i9 == 4) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            c6Var.setTag(1);
            fh.s sVar = c6Var.d;
            CharSequence charSequence = xu0Var.A;
            c6Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z10 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), false);
            c6Var.setTag(null);
            c6Var.setEnabled(!xu0Var.E);
            sVar.setEnabled(true ^ xu0Var.E);
            sVar.setTextColor(org.telegram.ui.ActionBar.f6.l1(xu0Var.E ? 0.6f : 1.0f, xu0Var.getThemedColor(org.telegram.ui.ActionBar.f6.G6)));
            xu0.b0(xu0Var, view, q1Var.b());
            return;
        }
        if (i9 != 5) {
            if (i9 == 7) {
                org.telegram.ui.Cells.c6 c6Var2 = (org.telegram.ui.Cells.c6) view;
                c6Var2.setTag(1);
                CharSequence charSequence2 = xu0Var.B;
                c6Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                c6Var2.setTag(null);
                xu0.b0(xu0Var, view, q1Var.b());
                return;
            }
            return;
        }
        int b10 = q1Var.b();
        org.telegram.ui.Cells.c6 c6Var3 = (org.telegram.ui.Cells.c6) view;
        c6Var3.setTag(1);
        fh.s sVar2 = c6Var3.d;
        int i10 = b10 - xu0Var.j0;
        boolean z11 = !xu0Var.E || i10 >= xu0Var.x;
        sVar2.setEnabled(z11);
        sVar2.setTextColor(org.telegram.ui.ActionBar.f6.l1(z11 ? 1.0f : 0.6f, xu0Var.getThemedColor(org.telegram.ui.ActionBar.f6.G6)));
        c6Var3.n(xu0Var.v[i10], LocaleController.getString(z10 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        c6Var3.setTag(null);
        ImageView imageView = c6Var3.f;
        if (imageView != null) {
            imageView.setVisibility(z11 ? 0 : 8);
        }
        ImageView imageView2 = c6Var3.h;
        if (imageView2 != null) {
            imageView2.setAlpha(z11 ? 1.0f : 0.45f);
        }
        if (!xu0Var.b0 && xu0Var.c0 == b10) {
            EditTextBoldCursor textView = c6Var3.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            xu0Var.b0 = false;
            xu0Var.c0 = -1;
        }
        xu0.b0(xu0Var, view, b10);
    }

    @Override // f2.r0
    public final void z(f2.q1 q1Var) {
        int i9 = q1Var.f;
        if (i9 == 4 || i9 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.c6) q1Var.a).getTextView();
            if (textView.isFocused()) {
                xu0 xu0Var = this.d;
                if (xu0Var.Y) {
                    org.telegram.ui.Components.ux0 ux0Var = xu0Var.M;
                    if (ux0Var != null) {
                        ux0Var.f();
                    }
                    xu0Var.j0(true);
                }
                xu0Var.X = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}
