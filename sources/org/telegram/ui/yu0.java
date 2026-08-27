package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class yu0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.yu0 {
    public CharSequence A;
    public Editable B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final int J;
    public int K;
    public boolean L;
    public org.telegram.ui.Components.wx0 M;
    public org.telegram.ui.Components.yy N;
    public lh.a4 O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public int V;
    public boolean W;
    public org.telegram.ui.Cells.z5 X;
    public final boolean Y;
    public final boolean Z;
    public org.telegram.ui.ActionBar.v0 a;
    public xu0 a0;
    public wu0 b;
    public boolean b0;
    public ta1 c;
    public int c0;
    public f2.k0 d;
    public int d0;
    public ed e;
    public int e0;
    public final rn f;
    public int f0;
    public int g0;
    public org.telegram.ui.Components.x30 h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public final int n;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int[] r;
    public int r0;
    public int s;
    public int s0;
    public int t0;
    public final w5 u0;
    public final CharSequence[] v;
    public TLRPC.MessageMedia v0;
    public final boolean[] w;
    public boolean w0;
    public int x;
    public boolean x0;
    public int y;

    public yu0(rn rnVar) {
        super(null);
        this.y = 1;
        this.C = true;
        this.D = false;
        this.F = true;
        this.K = AndroidUtilities.dp(3.0f);
        this.c0 = -1;
        this.u0 = new w5(this, 12);
        this.Z = true;
        int i10 = getMessagesController().todoItemsMax;
        this.n = i10;
        this.v = new CharSequence[i10];
        this.w = new boolean[i10];
        this.f = rnVar;
        this.Y = AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium();
        this.H = false;
        this.J = 2;
    }

    public static void c0(yu0 yu0Var, View view, int i10) {
        int length;
        int i11;
        boolean z10 = yu0Var.Z;
        if (view instanceof org.telegram.ui.Cells.z5) {
            org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
            if (i10 == yu0Var.e0) {
                i11 = z10 ? yu0Var.getMessagesController().todoTitleLengthMax : 255;
                CharSequence charSequence = yu0Var.A;
                length = i11 - (charSequence != null ? charSequence.length() : 0);
            } else if (i10 == yu0Var.f0) {
                Editable editable = yu0Var.B;
                i11 = 200;
                length = 200 - (editable != null ? editable.length() : 0);
            } else {
                int i12 = yu0Var.j0;
                if (i10 < i12 || i10 >= yu0Var.y + i12) {
                    return;
                }
                int i13 = i10 - i12;
                int i14 = z10 ? yu0Var.getMessagesController().todoItemLengthMax : 100;
                CharSequence charSequence2 = yu0Var.v[i13];
                length = i14 - (charSequence2 != null ? charSequence2.length() : 0);
                i11 = i14;
            }
            float f10 = i11;
            if (length > f10 - (0.7f * f10)) {
                z5Var.setText2("");
                return;
            }
            z5Var.setText2(String.format("%d", Integer.valueOf(length)));
            org.telegram.ui.ActionBar.h5 textView2 = z5Var.getTextView2();
            int i15 = length < 0 ? org.telegram.ui.ActionBar.g6.p7 : org.telegram.ui.ActionBar.g6.A6;
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
            textView2.setTag(Integer.valueOf(i15));
        }
    }

    public static void d0(yu0 yu0Var, org.telegram.ui.Cells.z5 z5Var, boolean z10) {
        if (yu0Var.Y && z10) {
            if (yu0Var.X == z5Var && yu0Var.L && yu0Var.x0) {
                yu0Var.j0();
                yu0Var.L = false;
            }
            org.telegram.ui.Cells.z5 z5Var2 = yu0Var.X;
            yu0Var.X = z5Var;
            z5Var.setEmojiButtonVisibility(true);
            org.telegram.ui.Components.mg emojiButton = z5Var.getEmojiButton();
            org.telegram.ui.Components.kg kgVar = org.telegram.ui.Components.kg.e;
            emojiButton.j(kgVar, false);
            ta1 ta1Var = yu0Var.c;
            View F = ta1Var.F(z5Var);
            f2.o1 T = F == null ? null : ta1Var.T(F);
            org.telegram.ui.Components.wx0 wx0Var = yu0Var.M;
            if (wx0Var != null) {
                wx0Var.f();
                org.telegram.ui.Components.wx0 wx0Var2 = yu0Var.M;
                if (wx0Var2 != null && T != null) {
                    View view = T.a;
                    if ((view instanceof org.telegram.ui.Cells.z5) && wx0Var2.getDelegate() != view) {
                        yu0Var.M.setDelegate((org.telegram.ui.Cells.z5) view);
                    }
                }
            }
            if (z5Var2 == null || z5Var2 == z5Var) {
                return;
            }
            if (yu0Var.L) {
                yu0Var.j0();
                yu0Var.k0(false);
                yu0Var.m0();
            }
            z5Var2.setEmojiButtonVisibility(false);
            z5Var2.getEmojiButton().j(kgVar, false);
        }
    }

    public static void e0(yu0 yu0Var, org.telegram.ui.Cells.z5 z5Var) {
        yu0Var.X = z5Var;
        if (!yu0Var.L) {
            yu0Var.q0(1);
        } else {
            yu0Var.j0();
            yu0Var.m0();
        }
    }

    @Override // org.telegram.ui.Components.yu0
    public final void H(int i10, boolean z10) {
        boolean z11;
        if (this.Y) {
            if (i10 > AndroidUtilities.dp(50.0f) && this.U && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                if (z10) {
                    this.T = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.T).commit();
                } else {
                    this.S = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.S).commit();
                }
            }
            if (this.L) {
                int i11 = z10 ? this.T : this.S;
                if (this.x0) {
                    i11 += AndroidUtilities.dp(120.0f);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.N.getLayoutParams();
                int i12 = layoutParams.width;
                int i13 = AndroidUtilities.displaySize.x;
                if (i12 != i13 || layoutParams.height != i11 || this.w0 != this.x0) {
                    layoutParams.width = i13;
                    layoutParams.height = i11;
                    this.N.setLayoutParams(layoutParams);
                    this.R = layoutParams.height;
                    this.O.a();
                    this.e.requestLayout();
                    boolean z12 = this.w0;
                    if (z12 != this.x0) {
                        g0(z12 ? -AndroidUtilities.dp(120.0f) : AndroidUtilities.dp(120.0f));
                    }
                    this.w0 = this.x0;
                }
            }
            if (this.V == i10 && this.W == z10) {
                return;
            }
            this.V = i10;
            this.W = z10;
            boolean z13 = this.U;
            org.telegram.ui.Cells.z5 z5Var = this.X;
            if (z5Var != null) {
                this.U = z5Var.getEditField().isFocused() && this.O.c() && i10 > 0;
            } else {
                this.U = false;
            }
            if (this.U && this.L) {
                q0(0);
            }
            if (this.R != 0 && !(z11 = this.U) && z11 != z13 && !this.L) {
                this.R = 0;
                this.O.a();
                this.e.requestLayout();
            }
            if (this.U && this.P) {
                this.P = false;
                AndroidUtilities.cancelRunOnUIThread(this.u0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        String upperCase;
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        kVar.D(getThemedColor(i10), false);
        this.actionBar.D(getThemedColor(i10), true);
        this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.g6.z8), false);
        this.actionBar.setTitleColor(getThemedColor(i10));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z10 = this.Z;
        if (z10) {
            this.actionBar.setTitle(LocaleController.getString(this.E ? R.string.TodoAddTasksTitle : R.string.TodoEditTitle));
        } else if (this.J == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).I0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new qu0(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        if (z10) {
            upperCase = LocaleController.getString(this.E ? R.string.TodoAddTasksButton : R.string.TodoEditTasksButton);
        } else {
            upperCase = LocaleController.getString(R.string.Create).toUpperCase();
        }
        this.a = n10.e(1, upperCase);
        this.b = new wu0(this, context);
        ed edVar = new ed(3, context, this);
        this.e = edVar;
        edVar.setDelegate(this);
        ed edVar2 = this.e;
        this.fragmentView = edVar2;
        edVar2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.c = new ta1(context, 10, null);
        f2.l lVar = new f2.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.er.h);
        lVar.n(350L);
        this.c.setItemAnimator(lVar);
        this.c.setVerticalScrollBarEnabled(false);
        ((f2.l) this.c.getItemAnimator()).C = false;
        f2.k0 k0Var = new f2.k0(1, false);
        this.d = k0Var;
        this.c.setLayoutManager(k0Var);
        new f2.f0(new kh.g(this, 6)).d(this.c);
        frameLayout.addView(this.c, h7.z5.e(-1, -1, 51));
        this.c.setAdapter(this.b);
        this.c.setOnItemClickListener(new i(this, 22));
        this.c.setOnScrollListener(new m3(this, 24));
        org.telegram.ui.Components.x30 x30Var = new org.telegram.ui.Components.x30(context, 4);
        this.h = x30Var;
        x30Var.setText(LocaleController.getString(R.string.PollTapToSelect));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, h7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.Y) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.wx0 wx0Var = new org.telegram.ui.Components.wx0(context, this.currentAccount, null, this.resourceProvider);
            this.M = wx0Var;
            wx0Var.y = true;
            wx0Var.A = true;
            wx0Var.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            frameLayout.addView(this.M, h7.z5.e(-2, 160, 51));
        }
        this.O = new lh.a4(this.e, false, null);
        i0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.yy yyVar = this.N;
            if (yyVar != null) {
                yyVar.L.f1();
            }
            org.telegram.ui.Cells.z5 z5Var = this.X;
            if (z5Var != null) {
                int currentTextColor = z5Var.getEditField().getCurrentTextColor();
                this.X.getEditField().setTextColor(-1);
                this.X.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void f0() {
        int i10;
        org.telegram.ui.Components.wx0 wx0Var = this.M;
        if (wx0Var != null) {
            wx0Var.setDelegate(null);
            this.M.f();
        }
        int i11 = this.y;
        this.w[i11] = false;
        int i12 = i11 + 1;
        this.y = i12;
        if (this.r != null) {
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                int[] iArr2 = this.r;
                if (i13 < iArr2.length) {
                    i10 = iArr2[i13];
                } else {
                    i10 = this.s + 1;
                    this.s = i10;
                }
                iArr[i13] = i10;
            }
            this.r = iArr;
        }
        if (this.y == this.v.length) {
            this.b.u(this.k0);
        }
        this.b.o(this.k0);
        r0();
        this.b0 = false;
        this.c0 = (this.j0 + this.y) - 1;
        this.b.m(this.l0);
    }

    public final void g0(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new dg(this, f10, 3));
        ofFloat.addListener(new ru0(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.w);
        ofFloat.start();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 16, new Class[]{org.telegram.ui.Cells.j4.class, org.telegram.ui.Cells.l8.class, org.telegram.ui.Cells.z5.class, org.telegram.ui.Cells.p8.class}, null, null, null, org.telegram.ui.ActionBar.g6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i11 = org.telegram.ui.ActionBar.g6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 262144, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 262144, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A6));
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 4, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.H6));
        int i13 = org.telegram.ui.ActionBar.g6.m6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"deleteImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"moveImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 196608, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 262144, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.g6.k7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.M6));
        int i15 = org.telegram.ui.ActionBar.g6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 32, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, null, null, -1, null, i14));
        return arrayList;
    }

    public final boolean h0(boolean z10) {
        TLRPC.MessageMedia messageMedia = this.v0;
        boolean z11 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.v;
        boolean z12 = false;
        if (z11) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i10 = 0;
            for (int i11 = 0; i11 < Math.min(this.y, charSequenceArr.length); i11++) {
                if (!TextUtils.isEmpty(charSequenceArr[i11])) {
                    i10++;
                }
            }
            boolean z13 = (this.E || TextUtils.equals(todoList.title.text, org.telegram.ui.Components.in.Y(this.A))) && i10 == todoList.list.size();
            if (z13) {
                for (int i12 = 0; i12 < i10; i12++) {
                    if (!TextUtils.equals(charSequenceArr[i12].toString(), todoList.list.get(i12).title.text)) {
                        break;
                    }
                }
            }
            z12 = z13;
        } else {
            boolean isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.in.Y(this.A));
            if (isEmpty) {
                for (int i13 = 0; i13 < this.y && (isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.in.Y(charSequenceArr[i13]))); i13++) {
                }
            }
            z12 = isEmpty;
        }
        if (z10 && !z12) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z14 = this.Z;
            alertDialog$Builder.a.N = LocaleController.getString(z14 ? R.string.CancelTodoAlertTitle : R.string.CancelPollAlertTitle);
            alertDialog$Builder.a.P = LocaleController.getString(z14 ? R.string.CancelTodoAlertText : R.string.CancelPollAlertText);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new dl0(this, 4));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(alertDialog$Builder.a);
        }
        return z12;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean hideKeyboardOnShow() {
        return this.c0 < 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i0() {
        int i10;
        boolean z10;
        boolean z11 = this.H;
        CharSequence[] charSequenceArr = this.v;
        if (z11) {
            int i11 = 0;
            i10 = 0;
            while (true) {
                boolean[] zArr = this.w;
                if (i11 >= zArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(org.telegram.ui.Components.in.Y(charSequenceArr[i11])) && zArr[i11]) {
                    i10++;
                }
                i11++;
            }
        } else {
            i10 = 0;
        }
        boolean z12 = this.Z;
        int i12 = z12 ? getMessagesController().todoTitleLengthMax : 255;
        int i13 = z12 ? getMessagesController().todoItemLengthMax : 100;
        if ((TextUtils.isEmpty(org.telegram.ui.Components.in.Y(this.B)) || this.B.length() <= 200) && !TextUtils.isEmpty(org.telegram.ui.Components.in.Y(this.A)) && this.A.length() <= i12) {
            int i14 = 0;
            int i15 = 0;
            while (true) {
                if (i14 >= charSequenceArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(org.telegram.ui.Components.in.Y(charSequenceArr[i14]))) {
                    if (charSequenceArr[i14].length() > i13) {
                        i15 = 0;
                        break;
                    }
                    i15++;
                }
                i14++;
            }
            if (i15 >= (z12 ? 1 : 2) && (!this.H || i10 >= 1)) {
                z10 = true;
                this.a.setEnabled((this.H && i10 == 0) || z10);
                this.a.setAlpha(z10 ? 1.0f : 0.5f);
            }
        }
        z10 = false;
        if (this.H) {
            this.a.setEnabled((this.H && i10 == 0) || z10);
            this.a.setAlpha(z10 ? 1.0f : 0.5f);
        }
        this.a.setEnabled((this.H && i10 == 0) || z10);
        this.a.setAlpha(z10 ? 1.0f : 0.5f);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().D0) {
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false);
            if (this.actionBar.t()) {
                w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.w8, false);
            }
            if (i0.b.f(w02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    public final void j0() {
        if (this.x0) {
            this.N.u(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.N.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.N.setLayoutParams(layoutParams);
            this.R = layoutParams.height;
            this.w0 = this.x0;
            this.x0 = false;
            g0(-AndroidUtilities.dp(120.0f));
        }
    }

    public final void k0(boolean z10) {
        if (this.Y) {
            int i10 = 1;
            if (this.L) {
                org.telegram.ui.Components.yy yyVar = this.N;
                yyVar.L.B0();
                yyVar.E.scrollTo(0, 0);
                yyVar.H(1);
                yyVar.M.h1(0, 0);
                this.N.u(false);
                if (z10) {
                    this.N.C();
                }
                this.x0 = false;
                q0(0);
            }
            if (z10) {
                org.telegram.ui.Components.yy yyVar2 = this.N;
                if (yyVar2 == null || yyVar2.getVisibility() != 0) {
                    l0();
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.N.getMeasuredHeight());
                ofFloat.addUpdateListener(new pu0(this, i10));
                ofFloat.addListener(new ru0(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.w);
                ofFloat.start();
            }
        }
    }

    public final void l0() {
        org.telegram.ui.Components.yy yyVar;
        org.telegram.ui.Components.mg emojiButton;
        if (!this.L && (yyVar = this.N) != null && yyVar.getVisibility() != 8) {
            org.telegram.ui.Cells.z5 z5Var = this.X;
            if (z5Var != null && (emojiButton = z5Var.getEmojiButton()) != null) {
                emojiButton.j(org.telegram.ui.Components.kg.e, false);
            }
            this.N.setVisibility(8);
        }
        int i10 = this.R;
        this.R = 0;
        if (i10 != 0) {
            this.O.a();
        }
    }

    public final void m0() {
        this.O.e = true;
        EditTextBoldCursor editField = this.X.getEditField();
        editField.requestFocus();
        AndroidUtilities.showKeyboard(editField);
        q0(AndroidUtilities.usingHardwareInput ? 0 : 2);
        if (AndroidUtilities.usingHardwareInput || this.U || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
            return;
        }
        this.P = true;
        w5 w5Var = this.u0;
        AndroidUtilities.cancelRunOnUIThread(w5Var);
        AndroidUtilities.runOnUIThread(w5Var, 100L);
    }

    public final void n0(pg pgVar) {
        this.a0 = pgVar;
    }

    public final void o0(TLRPC.MessageMedia messageMedia, boolean z10) {
        p0(messageMedia, z10, -1);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        if (!this.L) {
            return h0(z10);
        }
        if (!z10) {
            return false;
        }
        k0(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        View view;
        super.onBecomeFullyVisible();
        if (!this.b0 || this.c0 < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= this.c.getChildCount()) {
                view = null;
                break;
            }
            view = this.c.getChildAt(i10);
            this.c.getClass();
            if (RecyclerView.R(view) == this.c0) {
                break;
            } else {
                i10++;
            }
        }
        if (view instanceof org.telegram.ui.Cells.z5) {
            AndroidUtilities.runOnUIThread(new ah(5, ((org.telegram.ui.Cells.z5) view).getTextView()), 300L);
            this.c0 = -1;
        }
        this.b0 = false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        r0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.Q = true;
        if (this.Y) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.yy yyVar = this.N;
            if (yyVar != null) {
                this.e.removeView(yyVar);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        if (this.Y) {
            k0(false);
            org.telegram.ui.Components.wx0 wx0Var = this.M;
            if (wx0Var != null) {
                wx0Var.f();
            }
            org.telegram.ui.Cells.z5 z5Var = this.X;
            if (z5Var != null) {
                z5Var.setEmojiButtonVisibility(false);
                this.X.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.X.getEditField());
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        wu0 wu0Var = this.b;
        if (wu0Var != null) {
            wu0Var.l();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public final void p0(TLRPC.MessageMedia messageMedia, boolean z10, int i10) {
        int i11;
        this.v0 = messageMedia;
        this.E = z10;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messageMediaToDo.todo.title.text);
            this.A = spannableStringBuilder;
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
            this.A = replaceEmoji;
            Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(replaceEmoji, tL_messageMediaToDo.todo.title.entities, textPaint.getFontMetricsInt());
            this.A = replaceAnimatedEmoji;
            MessageObject.addEntitiesToText(replaceAnimatedEmoji, tL_messageMediaToDo.todo.title.entities, false, false, false, false);
            int size = tL_messageMediaToDo.todo.list.size();
            this.y = size;
            this.x = size;
            this.s = 0;
            this.r = new int[size];
            int i12 = 0;
            while (true) {
                i11 = this.y;
                if (i12 >= i11) {
                    break;
                }
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaToDo.todo.list.get(i12).title;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                CharSequence[] charSequenceArr = this.v;
                charSequenceArr[i12] = spannableStringBuilder2;
                charSequenceArr[i12] = Emoji.replaceEmoji(charSequenceArr[i12], textPaint.getFontMetricsInt(), false);
                charSequenceArr[i12] = MessageObject.replaceAnimatedEmoji(charSequenceArr[i12], tL_textWithEntities.entities, textPaint.getFontMetricsInt());
                MessageObject.addEntitiesToText(charSequenceArr[i12], tL_textWithEntities.entities, false, false, false, false);
                this.r[i12] = tL_messageMediaToDo.todo.list.get(i12).id;
                this.s = Math.max(this.s, this.r[i12]);
                i12++;
            }
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            this.F = todoList.others_can_complete;
            this.D = todoList.others_can_append;
            if (this.E) {
                this.y = i11 + 1;
                r0();
                this.b0 = true;
                int i13 = this.j0;
                if (i10 < 0) {
                    i10 = this.y - 1;
                }
                this.c0 = i13 + i10;
            }
        }
    }

    public final void q0(int i10) {
        org.telegram.ui.Cells.z5 z5Var;
        if (this.Y) {
            int i11 = 0;
            int i12 = 1;
            if (i10 != 1) {
                org.telegram.ui.Components.mg emojiButton = this.X.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.j(org.telegram.ui.Components.kg.e, true);
                }
                org.telegram.ui.Components.yy yyVar = this.N;
                if (yyVar != null) {
                    this.L = false;
                    this.x0 = false;
                    if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                        yyVar.setVisibility(8);
                    }
                }
                if (i10 == 0) {
                    this.R = 0;
                }
                this.O.a();
                this.e.requestLayout();
                return;
            }
            org.telegram.ui.Components.yy yyVar2 = this.N;
            boolean z10 = yyVar2 != null && yyVar2.getVisibility() == 0;
            org.telegram.ui.Components.yy yyVar3 = this.N;
            if (yyVar3 != null && yyVar3.Y0 != UserConfig.selectedAccount) {
                this.e.removeView(yyVar3);
                this.N = null;
            }
            if (this.N == null) {
                org.telegram.ui.Components.yy yyVar4 = new org.telegram.ui.Components.yy(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                this.N = yyVar4;
                yyVar4.t2 = false;
                yyVar4.Q0 = false;
                yyVar4.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.N.setForseMultiwindowLayout(true);
                }
                this.N.setDelegate(new su0(this));
                this.e.addView(this.N);
            }
            this.N.setVisibility(0);
            this.L = true;
            org.telegram.ui.Components.yy yyVar5 = this.N;
            if (this.S <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.S = AndroidUtilities.dp(150.0f);
                } else {
                    this.S = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.T <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.T = AndroidUtilities.dp(150.0f);
                } else {
                    this.T = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            int i13 = point.x > point.y ? this.T : this.S;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) yyVar5.getLayoutParams();
            layoutParams.height = i13;
            yyVar5.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (z5Var = this.X) != null) {
                AndroidUtilities.hideKeyboard(z5Var.getEditField());
            }
            this.R = i13;
            this.O.a();
            this.e.requestLayout();
            org.telegram.ui.Components.mg emojiButton2 = this.X.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(org.telegram.ui.Components.kg.d, true);
            }
            if (z10 || this.U) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.R, 0.0f);
            ofFloat.addUpdateListener(new pu0(this, i11));
            ofFloat.addListener(new ru0(this, i12));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.w);
            ofFloat.start();
        }
    }

    public final void r0() {
        this.d0 = -1;
        this.e0 = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.n0 = -1;
        this.o0 = -1;
        this.q0 = -1;
        this.r0 = -1;
        this.p0 = -1;
        this.s0 = -1;
        this.m0 = -1;
        this.t0 = 0;
        boolean z10 = this.Z;
        if (!z10 || !this.E) {
            this.d0 = 0;
            this.e0 = 1;
            this.h0 = 2;
            this.t0 = 4;
            this.i0 = 3;
        }
        int i10 = this.y;
        if (i10 != 0) {
            int i11 = this.t0;
            this.j0 = i11;
            this.t0 = i11 + i10;
        }
        if (i10 != this.v.length) {
            int i12 = this.t0;
            this.t0 = i12 + 1;
            this.k0 = i12;
        }
        int i13 = this.t0;
        int i14 = i13 + 1;
        this.t0 = i14;
        this.l0 = i13;
        if (z10 && this.E) {
            return;
        }
        int i15 = i13 + 2;
        this.t0 = i15;
        this.m0 = i14;
        if (z10) {
            int i16 = i13 + 3;
            this.t0 = i16;
            this.r0 = i15;
            if (this.F) {
                this.t0 = i13 + 4;
                this.q0 = i16;
                return;
            }
            return;
        }
        TLRPC.Chat chat = this.f.e;
        if (!ChatObject.isChannel(chat) || chat.megagroup) {
            int i17 = this.t0;
            this.t0 = i17 + 1;
            this.n0 = i17;
        }
        int i18 = this.J;
        if (i18 != 1) {
            int i19 = this.t0;
            this.t0 = i19 + 1;
            this.o0 = i19;
        }
        if (i18 == 0) {
            int i20 = this.t0;
            this.t0 = i20 + 1;
            this.p0 = i20;
        }
        int i21 = this.t0;
        int i22 = i21 + 1;
        this.t0 = i22;
        this.s0 = i21;
        if (this.H) {
            this.f0 = i22;
            this.t0 = i21 + 3;
            this.g0 = i21 + 2;
        }
    }
}
