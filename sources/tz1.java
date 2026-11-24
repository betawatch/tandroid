// default package

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class tz1 extends qu3 {
    public zb1 e2;
    public final /* synthetic */ ChatActivityEnterView f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz1(ChatActivityEnterView chatActivityEnterView, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.f2 = chatActivityEnterView;
    }

    @Override // qu3
    public final void E() {
        uz1 uz1Var = this.f2.P3;
        if (uz1Var != null) {
            uz1Var.s1();
        }
    }

    @Override // qu3
    public final void F() {
        uz1 uz1Var = this.f2.P3;
        if (uz1Var != null) {
            uz1Var.e();
        }
    }

    public final void J(Uri uri, String str) {
        yv1 yv1Var = this.f2.F3;
        Utilities.e.c(new co1((Object) this, (Object) uri, (Object) gm.q0(MimeTypeMap.getSingleton().getExtensionFromMimeType(str), yv1Var != null && yv1Var.x()), (byte) 11));
    }

    public final void K(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.f2;
        yv1 yv1Var = chatActivityEnterView.F3;
        if (yv1Var == null || yv1Var.getParentActivity() == null) {
            return;
        }
        byte b = 0;
        jo6 jo6Var = (jo6) arrayList.get(0);
        if (chatActivityEnterView.p3) {
            gm.t1(this);
            gm.d3(new rz1(this, arrayList, file, b), 100L);
        } else {
            PhotoViewer.r0().T1(null, yv1Var, chatActivityEnterView.L4);
            PhotoViewer.r0().o1(arrayList, 0, 2, false, new sz1(this, jo6Var, file), chatActivityEnterView.F3);
        }
    }

    public final void L(lj4 lj4Var, boolean z, int i, int i2) {
        k47 threadMessage;
        k47 threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.f2;
        yv1 yv1Var = chatActivityEnterView.F3;
        j67 j67Var = chatActivityEnterView.M0;
        if (j67Var != null) {
            j67Var.f(true);
            chatActivityEnterView.M0 = null;
        }
        nv1 nv1Var = chatActivityEnterView.L3;
        if (nv1Var != null && yv1Var != null && nv1Var.f) {
            yv1Var.uc();
            return;
        }
        fq5 fq5Var = (fq5) lj4Var.a;
        boolean hasMimeType = fq5Var.getDescription().hasMimeType("image/gif");
        j5 j5Var = chatActivityEnterView.S;
        if (hasMimeType) {
            Uri e = fq5Var.e();
            long j = chatActivityEnterView.G3;
            k47 k47Var = chatActivityEnterView.J3;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            a6a.S(j5Var, null, null, e, null, "image/gif", j, k47Var, threadMessage2, null, chatActivityEnterView.L3, z, lj4Var, yv1Var != null ? yv1Var.X6() : null);
        } else {
            Uri e2 = fq5Var.e();
            long j2 = chatActivityEnterView.G3;
            k47 k47Var2 = chatActivityEnterView.J3;
            threadMessage = chatActivityEnterView.getThreadMessage();
            a6a.X(j5Var, e2, j2, k47Var2, threadMessage, lj4Var, null, z, 0, yv1Var != null ? yv1Var.X6() : null);
        }
        uz1 uz1Var = chatActivityEnterView.P3;
        if (uz1Var != null) {
            uz1Var.w(null, true, i, i2, 0L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        boolean z = false;
        if (this.f2.b0) {
            return false;
        }
        if (keyEvent.getAction() == 0 && keyEvent.isCtrlPressed() && !keyEvent.isAltPressed()) {
            int i2 = 4;
            if (keyEvent.isShiftPressed()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 41) {
                    if (keyCode != 44) {
                        if (keyCode == 47 || keyCode == 52) {
                            i = 8;
                        }
                        i = 0;
                    } else {
                        i = 256;
                    }
                    if (!z) {
                    }
                    if (z) {
                    }
                }
                i = 4;
                if (!z) {
                }
                if (z) {
                }
            } else {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 != 30) {
                    if (keyCode2 != 33) {
                        if (keyCode2 == 37) {
                            i = 2;
                        } else if (keyCode2 != 39) {
                            if (keyCode2 == 49) {
                                i = 16;
                            }
                            i = 0;
                        } else {
                            i = 0;
                            z = true;
                        }
                    }
                    i = 4;
                } else {
                    i = 1;
                }
                if ((!z || i != 0) && getSelectionStart() != getSelectionEnd()) {
                    if (z) {
                        D(null);
                        return true;
                    }
                    if (getText() != null) {
                        int selectionStart = getSelectionStart();
                        int selectionEnd = getSelectionEnd();
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            if (selectionStart > selectionEnd) {
                                selectionEnd = selectionStart;
                                selectionStart = selectionEnd;
                            }
                            if (selectionStart < selectionEnd) {
                                if ((c(selectionStart, selectionEnd) & i) == 0) {
                                    if (i == 4) {
                                        i2 = 49435;
                                    } else if (i == 16384) {
                                        i2 = 32772;
                                    } else if (i == 32768) {
                                        i2 = 16388;
                                    }
                                    b(i2, selectionStart, selectionEnd);
                                    a(i, selectionStart, selectionEnd);
                                    return true;
                                }
                                b(i, selectionStart, selectionEnd);
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final ylb getResourcesProvider() {
        return this.f2.L4;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
        ChatActivityEnterView chatActivityEnterView = this.f2;
        yv1 yv1Var = chatActivityEnterView.F3;
        if (yv1Var != null) {
            yv1Var.extendActionMode(menu);
        } else {
            chatActivityEnterView.B0(menu);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        ChatActivityEnterView chatActivityEnterView = this.f2;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        try {
            int i = ChatActivityEnterView.z7;
            if ((chatActivityEnterView.R2 != null) || chatActivityEnterView.w7) {
                lv3.b(editorInfo, null);
            } else {
                lv3.b(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
            }
            return dne.a(onCreateInputConnection, editorInfo, new cd1((Object) this, (byte) 15));
        } catch (Throwable th) {
            fc4.g(th, true);
            return onCreateInputConnection;
        }
    }

    @Override // qu3, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z = getMeasuredWidth() == 0 && getMeasuredHeight() == 0;
        ChatActivityEnterView chatActivityEnterView = this.f2;
        chatActivityEnterView.T = z;
        super.onMeasure(i, i2);
        if (chatActivityEnterView.T) {
            int lineCount = getLineCount();
            chatActivityEnterView.U = lineCount;
            chatActivityEnterView.V1(lineCount > 2 && !TextUtils.isEmpty(getText().toString().trim()));
            chatActivityEnterView.b2(chatActivityEnterView.U > 2 && !TextUtils.isEmpty(getText().toString().trim()));
        }
        chatActivityEnterView.T = false;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        uz1 uz1Var = this.f2.P3;
        if (uz1Var != null) {
            uz1Var.I();
        }
    }

    @Override // vu3, android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        bu5 bu5Var;
        sy1 sy1Var;
        super.onSelectionChanged(i, i2);
        ChatActivityEnterView chatActivityEnterView = this.f2;
        uz1 uz1Var = chatActivityEnterView.P3;
        if (uz1Var != null) {
            uz1Var.v();
        }
        rx1 rx1Var = chatActivityEnterView.R0;
        if (rx1Var != null) {
            boolean z = (chatActivityEnterView.F3 == null || (sy1Var = chatActivityEnterView.F0) == null || sy1Var.getSelectionEnd() == chatActivityEnterView.F0.getSelectionStart()) ? false : true;
            if (rx1Var.x != z) {
                rx1Var.x = z;
                rx1Var.invalidate();
            }
            if (z || (bu5Var = chatActivityEnterView.c7) == null) {
                return;
            }
            bu5Var.u();
            chatActivityEnterView.c7 = null;
        }
    }

    @Override // qu3, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (i == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.f2;
            chatActivityEnterView.N2 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.R2 == null) {
                J(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.f2;
        final byte b = 0;
        if (!chatActivityEnterView.u4 && chatActivityEnterView.r4 == null) {
            if (!chatActivityEnterView.A0 && !chatActivityEnterView.Q0()) {
                zb1 zb1Var = this.e2;
                if (zb1Var == null) {
                    zb1Var = new zb1(this);
                    this.e2 = zb1Var;
                    zb1Var.h = new Runnable(this) { // from class: qz1
                        public final /* synthetic */ tz1 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b2 = b;
                            tz1 tz1Var = this.b;
                            switch (b2) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = tz1Var.f2;
                                    int i = ChatActivityEnterView.z7;
                                    chatActivityEnterView2.a2();
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = tz1Var.f2;
                                    chatActivityEnterView3.b4 = false;
                                    chatActivityEnterView3.k1();
                                    break;
                            }
                        }
                    };
                }
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                RectF rectF = gm.P;
                rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
                zb1Var.i = false;
                zb1Var.c = 0;
                zb1Var.a(rectF);
                return this.e2.b(motionEvent);
            }
            final byte b2 = 1;
            if (chatActivityEnterView.R0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.H2 != 0) {
                    chatActivityEnterView.R1(0, false);
                    chatActivityEnterView.V0.r(false);
                    requestFocus();
                }
                chatActivityEnterView.Z1(gm.D ? 0 : 2, 0, true, true);
                if (!chatActivityEnterView.p4) {
                    chatActivityEnterView.k1();
                    return true;
                }
                chatActivityEnterView.S1(false, true, false, true);
                chatActivityEnterView.b4 = true;
                gm.d3(new Runnable(this) { // from class: qz1
                    public final /* synthetic */ tz1 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b22 = b2;
                        tz1 tz1Var = this.b;
                        switch (b22) {
                            case 0:
                                ChatActivityEnterView chatActivityEnterView2 = tz1Var.f2;
                                int i = ChatActivityEnterView.z7;
                                chatActivityEnterView2.a2();
                                break;
                            default:
                                ChatActivityEnterView chatActivityEnterView3 = tz1Var.f2;
                                chatActivityEnterView3.b4 = false;
                                chatActivityEnterView3.k1();
                                break;
                        }
                    }
                }, 200L);
                return true;
            }
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        ChatActivityEnterView chatActivityEnterView = this.f2;
        if (chatActivityEnterView.A0 || chatActivityEnterView.Q0()) {
            return super.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        rect.bottom = gm.L(1000.0f) + rect.bottom;
        return super.requestRectangleOnScreen(rect);
    }

    @Override // vu3
    public void setOffsetY(float f) {
        super.setOffsetY(f);
        ela elaVar = this.f2.c2;
        if (elaVar.getForeground() != null) {
            elaVar.invalidateDrawable(elaVar.getForeground());
        }
    }
}
