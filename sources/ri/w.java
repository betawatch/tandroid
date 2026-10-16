package ri;

import android.opengl.GLES20;
import org.telegram.ui.Wallet.k5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public class w extends k5 {
    public final int e;

    public w() {
        super("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", b0.F);
        this.e = GLES20.glGetUniformLocation(this.a, "texOffset");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(String str, int i10) {
        super("uniform mat4 uTextureMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvarying vec2 vScreenTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = (uTextureMatrix * vec4(aTextureCoord.xy, 0.0, 1.0)).xy;\n    vScreenTextureCoord = aPosition.xy * 0.5 + 0.5;\n}\n", str);
        switch (i10) {
            case 1:
                super("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", str);
                this.e = GLES20.glGetUniformLocation(this.a, "texOffset");
                break;
            default:
                this.e = GLES20.glGetUniformLocation(this.a, "uTextureMatrix");
                break;
        }
    }
}
