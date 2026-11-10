package t1;

import ab.b0;
import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.l;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {
    public final EditText a;
    public final pb.b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        pb.b bVar = new pb.b(24);
        this.a = editText;
        this.b = bVar;
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
            s1.b bVar2 = (s1.b) ((b0) fVar.c).b;
            int a11 = bVar2.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a11 != 0 ? ((ByteBuffer) bVar2.d).getInt(a11 + bVar2.a) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i7, int i10) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return pb.b.c1(this, editableText, i7, i10, false) || super.deleteSurroundingText(i7, i10);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i7, int i10) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return pb.b.c1(this, editableText, i7, i10, true) || super.deleteSurroundingTextInCodePoints(i7, i10);
    }
}
