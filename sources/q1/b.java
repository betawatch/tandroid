package q1;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.k;
import com.google.firebase.messaging.t;
import d7.u;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {
    public final EditText a;
    public final u b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        u uVar = new u(21);
        this.a = editText;
        this.b = uVar;
        if (k.j != null) {
            k a2 = k.a();
            if (a2.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            a9.c cVar = a2.e;
            cVar.getClass();
            Bundle bundle = editorInfo.extras;
            p1.b bVar = (p1.b) ((t) cVar.c).b;
            int a3 = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a3 != 0 ? ((ByteBuffer) bVar.d).getInt(a3 + bVar.a) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i9, int i10) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return u.i2(this, editableText, i9, i10, false) || super.deleteSurroundingText(i9, i10);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i9, int i10) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return u.i2(this, editableText, i9, i10, true) || super.deleteSurroundingTextInCodePoints(i9, i10);
    }
}
