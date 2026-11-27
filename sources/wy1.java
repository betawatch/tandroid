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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class wy1 extends xt3 {
    public za1 f2;
    public final /* synthetic */ ChatActivityEnterView g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy1(ChatActivityEnterView chatActivityEnterView, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.g2 = chatActivityEnterView;
    }

    @Override // xt3
    public final void E() {
        xy1 xy1Var = this.g2.O3;
        if (xy1Var != null) {
            xy1Var.B1();
        }
    }

    @Override // xt3
    public final void F() {
        xy1 xy1Var = this.g2.O3;
        if (xy1Var != null) {
            xy1Var.e();
        }
    }

    public final void J(Uri uri, String str) {
        zu1 zu1Var = this.g2.E3;
        Utilities.e.c(new on1(this, uri, hl.q0(MimeTypeMap.getSingleton().getExtensionFromMimeType(str), zu1Var != null && zu1Var.y()), (byte) 12));
    }

    public final void K(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.g2;
        zu1 zu1Var = chatActivityEnterView.E3;
        if (zu1Var == null || zu1Var.getParentActivity() == null) {
            return;
        }
        byte b = 0;
        no6 no6Var = (no6) arrayList.get(0);
        if (chatActivityEnterView.o3) {
            hl.t1(this);
            hl.d3(new uy1(this, arrayList, file, b), 100L);
        } else {
            PhotoViewer.q0().T1(null, zu1Var, chatActivityEnterView.K4);
            PhotoViewer.q0().o1(arrayList, 0, 2, false, new vy1(this, no6Var, file), chatActivityEnterView.E3);
        }
    }

    public final void L(kj4 kj4Var, boolean z, int i, int i2) {
        r47 threadMessage;
        r47 threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.g2;
        zu1 zu1Var = chatActivityEnterView.E3;
        q67 q67Var = chatActivityEnterView.M0;
        if (q67Var != null) {
            q67Var.f(true);
            chatActivityEnterView.M0 = null;
        }
        ou1 ou1Var = chatActivityEnterView.K3;
        if (ou1Var != null && zu1Var != null && ou1Var.f) {
            zu1Var.uc();
            return;
        }
        iq5 iq5Var = (iq5) kj4Var.b;
        boolean hasMimeType = iq5Var.getDescription().hasMimeType("image/gif");
        k5 k5Var = chatActivityEnterView.S;
        if (hasMimeType) {
            Uri e = iq5Var.e();
            long j = chatActivityEnterView.F3;
            r47 r47Var = chatActivityEnterView.I3;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            r7a.S(k5Var, null, null, e, null, "image/gif", j, r47Var, threadMessage2, null, chatActivityEnterView.K3, z, kj4Var, zu1Var != null ? zu1Var.X6() : null);
        } else {
            Uri e2 = iq5Var.e();
            long j2 = chatActivityEnterView.F3;
            r47 r47Var2 = chatActivityEnterView.I3;
            threadMessage = chatActivityEnterView.getThreadMessage();
            r7a.X(k5Var, e2, j2, r47Var2, threadMessage, kj4Var, null, z, 0, zu1Var != null ? zu1Var.X6() : null);
        }
        xy1 xy1Var = chatActivityEnterView.O3;
        if (xy1Var != null) {
            xy1Var.x(null, true, i, i2, 0L);
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
        if (this.g2.b0) {
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
    public final vnb getResourcesProvider() {
        return this.g2.K4;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
        ChatActivityEnterView chatActivityEnterView = this.g2;
        zu1 zu1Var = chatActivityEnterView.E3;
        if (zu1Var != null) {
            zu1Var.extendActionMode(menu);
        } else {
            chatActivityEnterView.F0(menu);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        ChatActivityEnterView chatActivityEnterView = this.g2;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        try {
            int i = ChatActivityEnterView.X7;
            if ((chatActivityEnterView.Q2 != null) || chatActivityEnterView.T7) {
                tu3.b(editorInfo, null);
            } else {
                tu3.b(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
            }
            return tpe.a(onCreateInputConnection, editorInfo, new rd1((Object) this, (byte) 14));
        } catch (Throwable th) {
            cc4.g(th, true);
            return onCreateInputConnection;
        }
    }

    @Override // xt3, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z = getMeasuredWidth() == 0 && getMeasuredHeight() == 0;
        ChatActivityEnterView chatActivityEnterView = this.g2;
        chatActivityEnterView.T = z;
        super.onMeasure(i, i2);
        if (chatActivityEnterView.T) {
            int lineCount = getLineCount();
            chatActivityEnterView.U = lineCount;
            chatActivityEnterView.d2(lineCount > 2 && !TextUtils.isEmpty(getText().toString().trim()));
            chatActivityEnterView.k2(chatActivityEnterView.U > 2 && !TextUtils.isEmpty(getText().toString().trim()));
        }
        chatActivityEnterView.T = false;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        xy1 xy1Var = this.g2.O3;
        if (xy1Var != null) {
            xy1Var.J();
        }
    }

    @Override // cu3, android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        fu5 fu5Var;
        tx1 tx1Var;
        super.onSelectionChanged(i, i2);
        ChatActivityEnterView chatActivityEnterView = this.g2;
        xy1 xy1Var = chatActivityEnterView.O3;
        if (xy1Var != null) {
            xy1Var.w();
        }
        tw1 tw1Var = chatActivityEnterView.R0;
        if (tw1Var != null) {
            boolean z = (chatActivityEnterView.E3 == null || (tx1Var = chatActivityEnterView.F0) == null || tx1Var.getSelectionEnd() == chatActivityEnterView.F0.getSelectionStart()) ? false : true;
            if (tw1Var.x != z) {
                tw1Var.x = z;
                tw1Var.invalidate();
            }
            if (z || (fu5Var = chatActivityEnterView.x7) == null) {
                return;
            }
            fu5Var.u();
            chatActivityEnterView.x7 = null;
        }
    }

    @Override // xt3, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (i == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.g2;
            chatActivityEnterView.M2 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.Q2 == null) {
                J(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.g2;
        final byte b = 0;
        if (!chatActivityEnterView.t4 && chatActivityEnterView.q4 == null) {
            if (!chatActivityEnterView.A0 && !chatActivityEnterView.T0()) {
                za1 za1Var = this.f2;
                if (za1Var == null) {
                    za1Var = new za1(this);
                    this.f2 = za1Var;
                    za1Var.h = new Runnable(this) { // from class: ty1
                        public final /* synthetic */ wy1 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b2 = b;
                            wy1 wy1Var = this.b;
                            switch (b2) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = wy1Var.g2;
                                    int i = ChatActivityEnterView.X7;
                                    chatActivityEnterView2.j2();
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = wy1Var.g2;
                                    chatActivityEnterView3.a4 = false;
                                    chatActivityEnterView3.p1();
                                    break;
                            }
                        }
                    };
                }
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                RectF rectF = hl.P;
                rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
                za1Var.i = false;
                za1Var.c = 0;
                za1Var.a(rectF);
                return this.f2.b(motionEvent);
            }
            final byte b2 = 1;
            if (chatActivityEnterView.U0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.G2 != 0) {
                    chatActivityEnterView.Z1(0, false);
                    chatActivityEnterView.V0.r(false);
                    requestFocus();
                }
                chatActivityEnterView.i2(hl.D ? 0 : 2, 0, true, true);
                if (!chatActivityEnterView.o4) {
                    chatActivityEnterView.p1();
                    return true;
                }
                chatActivityEnterView.a2(false, true, false, true);
                chatActivityEnterView.a4 = true;
                hl.d3(new Runnable(this) { // from class: ty1
                    public final /* synthetic */ wy1 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b22 = b2;
                        wy1 wy1Var = this.b;
                        switch (b22) {
                            case 0:
                                ChatActivityEnterView chatActivityEnterView2 = wy1Var.g2;
                                int i = ChatActivityEnterView.X7;
                                chatActivityEnterView2.j2();
                                break;
                            default:
                                ChatActivityEnterView chatActivityEnterView3 = wy1Var.g2;
                                chatActivityEnterView3.a4 = false;
                                chatActivityEnterView3.p1();
                                break;
                        }
                    }
                }, 200L);
                return true;
            }
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        ChatActivityEnterView chatActivityEnterView = this.g2;
        if (chatActivityEnterView.A0 || chatActivityEnterView.T0()) {
            return super.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        rect.bottom = hl.L(1000.0f) + rect.bottom;
        return super.requestRectangleOnScreen(rect);
    }

    @Override // cu3
    public void setOffsetY(float f) {
        super.setOffsetY(f);
        wma wmaVar = this.g2.b2;
        if (wmaVar.getForeground() != null) {
            wmaVar.invalidateDrawable(wmaVar.getForeground());
        }
    }
}
