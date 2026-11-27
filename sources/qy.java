// default package

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class qy extends xt3 {
    public final /* synthetic */ byte f2;
    public final /* synthetic */ Object g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy(Context context, vnb vnbVar, Drawable drawable) {
        super(context, vnbVar);
        this.f2 = (byte) 0;
        this.g2 = drawable;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f2) {
            case 0:
                super.dispatchDraw(canvas);
                Drawable drawable = (Drawable) this.g2;
                drawable.setBounds(0, hl.L(8.0f), hl.L(20.0f), hl.L(28.0f));
                drawable.draw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // cu3
    public final int e() {
        switch (this.f2) {
            case 1:
            case 2:
                return 3;
            default:
                return super.e();
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.f2) {
            case 3:
                if (!ri5.b) {
                    super.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        switch (this.f2) {
            case 1:
                InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
                editorInfo.imeOptions &= -1073741825;
                return onCreateInputConnection;
            case 2:
                InputConnection onCreateInputConnection2 = super.onCreateInputConnection(editorInfo);
                if (((zh8) this.g2).s) {
                    editorInfo.imeOptions &= -1073741825;
                }
                return onCreateInputConnection2;
            default:
                return super.onCreateInputConnection(editorInfo);
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        byte b = this.f2;
        Object obj = this.g2;
        switch (b) {
            case 2:
                super.onFocusChanged(z, i, rect);
                ((zh8) obj).j(z);
                break;
            case 3:
                if (z) {
                    ((e0a) obj).G.p();
                    hl.d3(new a1a(this, (byte) 0), 200L);
                }
                super.onFocusChanged(z, i, rect);
                break;
            default:
                super.onFocusChanged(z, i, rect);
                break;
        }
    }

    @Override // cu3, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.f2) {
            case 1:
                super.onSizeChanged(i, i2, i3, i4);
                postOnAnimation(new lo1(this, (byte) 1));
                break;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                break;
        }
    }

    @Override // xt3, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        switch (this.f2) {
            case 2:
                if (i == 16908322 && (primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip()) != null && primaryClip.getItemCount() == 1 && hl.t(primaryClip.getItemAt(0).getText(), "\n") > 0) {
                    CharSequence text = primaryClip.getItemAt(0).getText();
                    ArrayList arrayList = new ArrayList();
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < text.length(); i2++) {
                        char charAt = text.charAt(i2);
                        if (charAt == '\n') {
                            arrayList.add(sb.toString());
                            sb.setLength(0);
                        } else {
                            sb.append(charAt);
                        }
                    }
                    if (!TextUtils.isEmpty(sb)) {
                        arrayList.add(sb);
                    }
                    if (((zh8) this.g2).m(arrayList)) {
                    }
                }
                break;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        byte b = this.f2;
        Object obj = this.g2;
        byte b2 = 1;
        switch (b) {
            case 2:
                if (isEnabled()) {
                    if (motionEvent.getAction() == 1) {
                        ((zh8) obj).l(this);
                    }
                    break;
                }
                break;
            case 3:
                if (motionEvent.getAction() != 1 || !((e0a) obj).G.t()) {
                    break;
                } else {
                    hl.d3(new a1a(this, b2), 200L);
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // xt3, org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public final ActionMode startActionMode(ActionMode.Callback callback, int i) {
        switch (this.f2) {
            case 2:
                ActionMode startActionMode = super.startActionMode(callback, i);
                ((zh8) this.g2).h(this, startActionMode);
                return startActionMode;
            default:
                return super.startActionMode(callback, i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qy(FrameLayout frameLayout, Context context, vnb vnbVar, byte b) {
        super(context, vnbVar);
        this.f2 = b;
        this.g2 = frameLayout;
    }

    @Override // xt3, org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public final ActionMode startActionMode(ActionMode.Callback callback) {
        switch (this.f2) {
            case 2:
                ActionMode startActionMode = super.startActionMode(callback);
                ((zh8) this.g2).h(this, startActionMode);
                return startActionMode;
            default:
                return super.startActionMode(callback);
        }
    }
}
