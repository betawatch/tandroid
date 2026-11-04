package s1;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.l;
import java.nio.ByteBuffer;
import v7.s;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {
    public final EditText a;
    public final s b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        s sVar = new s(22);
        this.a = editText;
        this.b = sVar;
        if (l.j != null) {
            l a10 = l.a();
            if (a10.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            androidx.emoji2.text.f fVar = a10.e;
            fVar.getClass();
            Bundle bundle = editorInfo.extras;
            r1.b bVar = (r1.b) ((ui.f) fVar.c).b;
            int a11 = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a11 != 0 ? ((ByteBuffer) bVar.d).getInt(a11 + bVar.a) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i3, int i10) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return s.F0(this, editableText, i3, i10, false) || super.deleteSurroundingText(i3, i10);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i3, int i10) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return s.F0(this, editableText, i3, i10, true) || super.deleteSurroundingTextInCodePoints(i3, i10);
    }
}
