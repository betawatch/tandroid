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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class xv0 extends org.telegram.ui.Components.kl0 {
    public final Context c;
    public final /* synthetic */ zv0 d;

    public xv0(zv0 zv0Var, Context context) {
        this.d = zv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int b10 = c1Var.b();
        zv0 zv0Var = this.d;
        if (b10 == zv0Var.i0 || b10 == zv0Var.u0 || b10 == zv0Var.v0) {
            return !zv0Var.I;
        }
        if (!zv0Var.I || b10 < (i10 = zv0Var.n0) || b10 >= zv0Var.y + i10) {
            if (b10 != zv0Var.o0 && b10 != zv0Var.r0 && b10 != zv0Var.s0 && (zv0Var.N != 0 || b10 != zv0Var.t0)) {
                return false;
            }
        } else if (b10 - i10 < zv0Var.x) {
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
        zv0 zv0Var = this.d;
        if (i10 == zv0Var.h0 || i10 == zv0Var.m0 || i10 == zv0Var.q0) {
            return 0;
        }
        if (i10 == zv0Var.l0) {
            return 1;
        }
        if (i10 == zv0Var.p0 || i10 == zv0Var.w0 || i10 == zv0Var.k0) {
            return 2;
        }
        if (i10 == zv0Var.o0) {
            return 3;
        }
        if (i10 == zv0Var.i0) {
            return 4;
        }
        if (i10 == zv0Var.j0) {
            return 7;
        }
        return (i10 == zv0Var.r0 || i10 == zv0Var.s0 || i10 == zv0Var.t0 || i10 == zv0Var.u0 || i10 == zv0Var.v0) ? 6 : 5;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        zv0 zv0Var = this.d;
        int i11 = zv0Var.N;
        boolean z10 = zv0Var.d0;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (i10 == zv0Var.h0) {
                l4Var.setText(LocaleController.getString(z10 ? zv0Var.z0 != null ? R.string.TodoEditTitle : R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i10 != zv0Var.m0) {
                if (i10 == zv0Var.q0) {
                    l4Var.setText(LocaleController.getString(R.string.Settings));
                    return;
                }
                return;
            } else if (i11 == 1) {
                l4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                return;
            } else {
                l4Var.setText(LocaleController.getString(z10 ? R.string.TodoItemsTitle : R.string.AnswerOptions2));
                return;
            }
        }
        if (i12 == 6) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            w8Var.setEnabled(!zv0Var.I);
            w8Var.getCheckBox().setAlpha(!zv0Var.I ? 1.0f : 0.6f);
            if (i10 == zv0Var.u0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), zv0Var.H, true);
                w8Var.e(null, true);
                return;
            }
            if (i10 == zv0Var.v0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), zv0Var.J, false);
                w8Var.e(null, true);
                return;
            }
            if (i10 == zv0Var.r0) {
                w8Var.f(LocaleController.getString(R.string.PollAnonymous), zv0Var.G, (zv0Var.s0 == -1 && zv0Var.t0 == -1) ? false : true);
                w8Var.e(null, true);
                return;
            } else if (i10 == zv0Var.s0) {
                w8Var.f(LocaleController.getString(R.string.PollMultiple), zv0Var.K, zv0Var.t0 != -1);
                w8Var.e(null, true);
                return;
            } else {
                if (i10 == zv0Var.t0) {
                    w8Var.f(LocaleController.getString(R.string.PollQuiz), zv0Var.L, false);
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
            r8Var.n(LocaleController.getString(z10 ? R.string.TodoNewTask : R.string.AddAnOption), new org.telegram.ui.Components.oq(drawable, drawable2), false);
            return;
        }
        org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
        e9Var.setFixedSize(0);
        e9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
        if (i10 == zv0Var.k0) {
            e9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
            return;
        }
        if (i10 == zv0Var.w0) {
            e9Var.setFixedSize(12);
            e9Var.setText(null);
            return;
        }
        int i13 = zv0Var.n - zv0Var.y;
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
        zv0 zv0Var = this.d;
        boolean z10 = zv0Var.c0;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                view = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
            } else if (i10 == 2) {
                view = new org.telegram.ui.Cells.e9(context);
            } else if (i10 == 3) {
                View r8Var = new org.telegram.ui.Cells.r8(context);
                r8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view = r8Var;
            } else if (i10 == 4) {
                uv0 uv0Var = new uv0(this, context, z10 ? 1 : 0);
                uv0Var.c();
                uv0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                uv0Var.b(new org.telegram.ui.Components.pn(4, this, uv0Var));
                view = uv0Var;
            } else if (i10 == 6) {
                View w8Var = new org.telegram.ui.Cells.w8(context);
                w8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view = w8Var;
            } else if (i10 != 7) {
                wv0 wv0Var = new wv0(this, context, z10 ? 1 : 0, new l60(zv0Var, 21));
                wv0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                wv0Var.b(new org.telegram.ui.Components.pn(6, this, wv0Var));
                wv0Var.setShowNextButton(true);
                EditTextBoldCursor textView = wv0Var.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new wd(3, this, wv0Var));
                textView.setOnKeyListener(new vg(wv0Var, 2));
                view = wv0Var;
            } else {
                vv0 vv0Var = new vv0(this, context, z10 ? 1 : 0);
                vv0Var.c();
                vv0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                vv0Var.b(new org.telegram.ui.Components.pn(5, this, vv0Var));
                view = vv0Var;
            }
        } else {
            View l4Var = new org.telegram.ui.Cells.l4(this.c, org.telegram.ui.ActionBar.j6.L6, 21, 15, false, null);
            l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            view = l4Var;
        }
        return com.google.android.gms.internal.vision.e2.l(view, view, -1, -2);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        zv0 zv0Var = this.d;
        boolean z10 = zv0Var.d0;
        int i10 = c1Var.f;
        View view = c1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            c6Var.setTag(1);
            org.telegram.ui.Cells.b6 b6Var = c6Var.d;
            CharSequence charSequence = zv0Var.E;
            c6Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z10 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), false);
            c6Var.setTag(null);
            c6Var.setEnabled(!zv0Var.I);
            b6Var.setEnabled(true ^ zv0Var.I);
            b6Var.setTextColor(org.telegram.ui.ActionBar.j6.l1(zv0Var.I ? 0.6f : 1.0f, zv0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6)));
            zv0.c0(zv0Var, view, c1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.c6 c6Var2 = (org.telegram.ui.Cells.c6) view;
                c6Var2.setTag(1);
                CharSequence charSequence2 = zv0Var.F;
                c6Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                c6Var2.setTag(null);
                zv0.c0(zv0Var, view, c1Var.b());
                return;
            }
            return;
        }
        int b10 = c1Var.b();
        org.telegram.ui.Cells.c6 c6Var3 = (org.telegram.ui.Cells.c6) view;
        c6Var3.setTag(1);
        org.telegram.ui.Cells.b6 b6Var2 = c6Var3.d;
        int i11 = b10 - zv0Var.n0;
        boolean z11 = !zv0Var.I || i11 >= zv0Var.x;
        b6Var2.setEnabled(z11);
        b6Var2.setTextColor(org.telegram.ui.ActionBar.j6.l1(z11 ? 1.0f : 0.6f, zv0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6)));
        c6Var3.n(zv0Var.v[i11], LocaleController.getString(z10 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        c6Var3.setTag(null);
        ImageView imageView = c6Var3.f;
        if (imageView != null) {
            imageView.setVisibility(z11 ? 0 : 8);
        }
        ImageView imageView2 = c6Var3.h;
        if (imageView2 != null) {
            imageView2.setAlpha(z11 ? 1.0f : 0.45f);
        }
        if (!zv0Var.f0 && zv0Var.g0 == b10) {
            EditTextBoldCursor textView = c6Var3.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            zv0Var.f0 = false;
            zv0Var.g0 = -1;
        }
        zv0.c0(zv0Var, view, b10);
    }

    @Override // s4.h0
    public final void z(s4.c1 c1Var) {
        int i10 = c1Var.f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.c6) c1Var.a).getTextView();
            if (textView.isFocused()) {
                zv0 zv0Var = this.d;
                if (zv0Var.c0) {
                    org.telegram.ui.Components.my0 my0Var = zv0Var.Q;
                    if (my0Var != null) {
                        my0Var.f();
                    }
                    zv0Var.k0(true);
                }
                zv0Var.b0 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}
