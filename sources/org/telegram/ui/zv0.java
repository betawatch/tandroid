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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class zv0 extends org.telegram.ui.Components.ul0 {
    public final Context c;
    public final /* synthetic */ bw0 d;

    public zv0(bw0 bw0Var, Context context) {
        this.d = bw0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int b10 = c1Var.b();
        bw0 bw0Var = this.d;
        if (b10 == bw0Var.i0 || b10 == bw0Var.u0 || b10 == bw0Var.v0) {
            return !bw0Var.I;
        }
        if (!bw0Var.I || b10 < (i10 = bw0Var.n0) || b10 >= bw0Var.y + i10) {
            if (b10 != bw0Var.o0 && b10 != bw0Var.r0 && b10 != bw0Var.s0 && (bw0Var.N != 0 || b10 != bw0Var.t0)) {
                return false;
            }
        } else if (b10 - i10 < bw0Var.x) {
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
        bw0 bw0Var = this.d;
        if (i10 == bw0Var.h0 || i10 == bw0Var.m0 || i10 == bw0Var.q0) {
            return 0;
        }
        if (i10 == bw0Var.l0) {
            return 1;
        }
        if (i10 == bw0Var.p0 || i10 == bw0Var.w0 || i10 == bw0Var.k0) {
            return 2;
        }
        if (i10 == bw0Var.o0) {
            return 3;
        }
        if (i10 == bw0Var.i0) {
            return 4;
        }
        if (i10 == bw0Var.j0) {
            return 7;
        }
        return (i10 == bw0Var.r0 || i10 == bw0Var.s0 || i10 == bw0Var.t0 || i10 == bw0Var.u0 || i10 == bw0Var.v0) ? 6 : 5;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        bw0 bw0Var = this.d;
        int i11 = bw0Var.N;
        boolean z10 = bw0Var.d0;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == bw0Var.h0) {
                m4Var.setText(LocaleController.getString(z10 ? bw0Var.z0 != null ? R.string.TodoEditTitle : R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i10 != bw0Var.m0) {
                if (i10 == bw0Var.q0) {
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
            x8Var.setEnabled(!bw0Var.I);
            x8Var.getCheckBox().setAlpha(!bw0Var.I ? 1.0f : 0.6f);
            if (i10 == bw0Var.u0) {
                x8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), bw0Var.H, true);
                x8Var.e(null, true);
                return;
            }
            if (i10 == bw0Var.v0) {
                x8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), bw0Var.J, false);
                x8Var.e(null, true);
                return;
            }
            if (i10 == bw0Var.r0) {
                x8Var.f(LocaleController.getString(R.string.PollAnonymous), bw0Var.G, (bw0Var.s0 == -1 && bw0Var.t0 == -1) ? false : true);
                x8Var.e(null, true);
                return;
            } else if (i10 == bw0Var.s0) {
                x8Var.f(LocaleController.getString(R.string.PollMultiple), bw0Var.K, bw0Var.t0 != -1);
                x8Var.e(null, true);
                return;
            } else {
                if (i10 == bw0Var.t0) {
                    x8Var.f(LocaleController.getString(R.string.PollQuiz), bw0Var.L, false);
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
            s8Var.e(-1, org.telegram.ui.ActionBar.j6.q6);
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k7, false), mode));
            s8Var.n(LocaleController.getString(z10 ? R.string.TodoNewTask : R.string.AddAnOption), new org.telegram.ui.Components.vq(drawable, drawable2), false);
            return;
        }
        org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
        f9Var.setFixedSize(0);
        f9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
        if (i10 == bw0Var.k0) {
            f9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
            return;
        }
        if (i10 == bw0Var.w0) {
            f9Var.setFixedSize(12);
            f9Var.setText(null);
            return;
        }
        int i13 = bw0Var.n - bw0Var.y;
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
        bw0 bw0Var = this.d;
        boolean z10 = bw0Var.c0;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                view = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
            } else if (i10 == 2) {
                view = new org.telegram.ui.Cells.f9(context);
            } else if (i10 == 3) {
                View s8Var = new org.telegram.ui.Cells.s8(context);
                s8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view = s8Var;
            } else if (i10 == 4) {
                wv0 wv0Var = new wv0(this, context, z10 ? 1 : 0);
                wv0Var.d();
                wv0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                wv0Var.c(new og.x(5, this, wv0Var));
                view = wv0Var;
            } else if (i10 == 6) {
                View x8Var = new org.telegram.ui.Cells.x8(context);
                x8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view = x8Var;
            } else if (i10 != 7) {
                yv0 yv0Var = new yv0(this, context, z10 ? 1 : 0, new l60(bw0Var, 21));
                yv0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                yv0Var.c(new og.x(7, this, yv0Var));
                yv0Var.setShowNextButton(true);
                EditTextBoldCursor textView = yv0Var.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new xd(3, this, yv0Var));
                textView.setOnKeyListener(new wg(yv0Var, 2));
                view = yv0Var;
            } else {
                xv0 xv0Var = new xv0(this, context, z10 ? 1 : 0);
                xv0Var.d();
                xv0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                xv0Var.c(new og.x(6, this, xv0Var));
                view = xv0Var;
            }
        } else {
            View m4Var = new org.telegram.ui.Cells.m4(this.c, org.telegram.ui.ActionBar.j6.L6, 21, 15, false, null);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            view = m4Var;
        }
        return com.google.android.gms.internal.vision.e2.j(view, view, -1, -2);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        bw0 bw0Var = this.d;
        boolean z10 = bw0Var.d0;
        int i10 = c1Var.f;
        View view = c1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
            e6Var.setTag(1);
            org.telegram.ui.Cells.d6 d6Var = e6Var.d;
            CharSequence charSequence = bw0Var.E;
            e6Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z10 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), false);
            e6Var.setTag(null);
            e6Var.setEnabled(!bw0Var.I);
            d6Var.setEnabled(true ^ bw0Var.I);
            d6Var.setTextColor(org.telegram.ui.ActionBar.j6.l1(bw0Var.I ? 0.6f : 1.0f, bw0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6)));
            bw0.c0(bw0Var, view, c1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.e6 e6Var2 = (org.telegram.ui.Cells.e6) view;
                e6Var2.setTag(1);
                CharSequence charSequence2 = bw0Var.F;
                e6Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                e6Var2.setTag(null);
                bw0.c0(bw0Var, view, c1Var.b());
                return;
            }
            return;
        }
        int b10 = c1Var.b();
        org.telegram.ui.Cells.e6 e6Var3 = (org.telegram.ui.Cells.e6) view;
        e6Var3.setTag(1);
        org.telegram.ui.Cells.d6 d6Var2 = e6Var3.d;
        int i11 = b10 - bw0Var.n0;
        boolean z11 = !bw0Var.I || i11 >= bw0Var.x;
        d6Var2.setEnabled(z11);
        d6Var2.setTextColor(org.telegram.ui.ActionBar.j6.l1(z11 ? 1.0f : 0.6f, bw0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6)));
        e6Var3.n(bw0Var.v[i11], LocaleController.getString(z10 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        e6Var3.setTag(null);
        ImageView imageView = e6Var3.f;
        if (imageView != null) {
            imageView.setVisibility(z11 ? 0 : 8);
        }
        ImageView imageView2 = e6Var3.h;
        if (imageView2 != null) {
            imageView2.setAlpha(z11 ? 1.0f : 0.45f);
        }
        if (!bw0Var.f0 && bw0Var.g0 == b10) {
            EditTextBoldCursor textView = e6Var3.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            bw0Var.f0 = false;
            bw0Var.g0 = -1;
        }
        bw0.c0(bw0Var, view, b10);
    }

    @Override // s4.h0
    public final void z(s4.c1 c1Var) {
        int i10 = c1Var.f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.e6) c1Var.a).getTextView();
            if (textView.isFocused()) {
                bw0 bw0Var = this.d;
                if (bw0Var.c0) {
                    org.telegram.ui.Components.zy0 zy0Var = bw0Var.Q;
                    if (zy0Var != null) {
                        zy0Var.f();
                    }
                    bw0Var.k0(true);
                }
                bw0Var.b0 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}
