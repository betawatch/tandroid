// default package

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class y1 implements iy0 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static cc6 LOG = cc6.a(y1.class);
    private ByteBuffer content;
    long contentStartPosition;
    n63 dataSource;
    long offset;
    private wu2 parent;
    protected String type;
    private byte[] userType;
    long memMapSize = -1;
    private ByteBuffer deadBytes = null;
    boolean isRead = true;
    boolean isParsed = true;

    public y1(String str) {
        this.type = str;
    }

    public final void a(ByteBuffer byteBuffer) {
        if (b()) {
            byteBuffer.putInt((int) getSize());
            byteBuffer.put(or5.d(getType()));
        } else {
            byteBuffer.putInt(1);
            byteBuffer.put(or5.d(getType()));
            byteBuffer.putLong(getSize());
        }
        if ("uuid".equals(getType())) {
            byteBuffer.put(getUserType());
        }
    }

    public final boolean b() {
        int i = "uuid".equals(getType()) ? 24 : 8;
        if (!this.isRead) {
            return this.memMapSize + ((long) i) < 4294967296L;
        }
        if (!this.isParsed) {
            return ((long) (this.content.limit() + i)) < 4294967296L;
        }
        long contentSize = getContentSize();
        ByteBuffer byteBuffer = this.deadBytes;
        return (contentSize + ((long) (byteBuffer != null ? byteBuffer.limit() : 0))) + ((long) i) < 4294967296L;
    }

    public final synchronized void c() {
        if (!this.isRead) {
            try {
                LOG.b("mem mapping " + getType());
                throw null;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override // iy0
    public void getBox(WritableByteChannel writableByteChannel) {
        if (!this.isRead) {
            ByteBuffer allocate = ByteBuffer.allocate((b() ? 8 : 16) + ("uuid".equals(getType()) ? 16 : 0));
            a(allocate);
            writableByteChannel.write((ByteBuffer) allocate.rewind());
            throw null;
        }
        if (!this.isParsed) {
            ByteBuffer allocate2 = ByteBuffer.allocate((b() ? 8 : 16) + ("uuid".equals(getType()) ? 16 : 0));
            a(allocate2);
            writableByteChannel.write((ByteBuffer) allocate2.rewind());
            writableByteChannel.write((ByteBuffer) this.content.position(0));
            return;
        }
        ByteBuffer allocate3 = ByteBuffer.allocate(mqd.a(getSize()));
        a(allocate3);
        getContent(allocate3);
        ByteBuffer byteBuffer = this.deadBytes;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            while (this.deadBytes.remaining() > 0) {
                allocate3.put(this.deadBytes);
            }
        }
        writableByteChannel.write((ByteBuffer) allocate3.rewind());
    }

    public long getContentSize() {
        return 8L;
    }

    public long getOffset() {
        return this.offset;
    }

    @Override // iy0
    public wu2 getParent() {
        return this.parent;
    }

    public String getPath() {
        return ey7.a(this, "");
    }

    @Override // iy0
    public long getSize() {
        long j;
        if (!this.isRead) {
            j = this.memMapSize;
        } else if (this.isParsed) {
            j = getContentSize();
        } else {
            ByteBuffer byteBuffer = this.content;
            j = byteBuffer != null ? byteBuffer.limit() : 0;
        }
        return j + (j >= 4294967288L ? 8 : 0) + 8 + ("uuid".equals(getType()) ? 16 : 0) + (this.deadBytes != null ? r6.limit() : 0);
    }

    @Override // iy0
    public String getType() {
        return this.type;
    }

    public byte[] getUserType() {
        return this.userType;
    }

    public boolean isParsed() {
        return this.isParsed;
    }

    public void parse(n63 n63Var, ByteBuffer byteBuffer, long j, qy0 qy0Var) {
        long position = n63Var.position();
        this.contentStartPosition = position;
        this.offset = position - byteBuffer.remaining();
        this.memMapSize = j;
        n63Var.position();
        n63Var.position();
        this.isRead = false;
        this.isParsed = false;
    }

    public final synchronized void parseDetails() {
        c();
        LOG.b("parsing details of " + getType());
        ByteBuffer byteBuffer = this.content;
        if (byteBuffer != null) {
            this.isParsed = true;
            byteBuffer.rewind();
            _parseDetails(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.deadBytes = byteBuffer.slice();
            }
            this.content = null;
        }
    }

    public void setDeadBytes(ByteBuffer byteBuffer) {
        this.deadBytes = byteBuffer;
    }

    @Override // iy0
    public void setParent(wu2 wu2Var) {
        this.parent = wu2Var;
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
    }

    public void getContent(ByteBuffer byteBuffer) {
    }
}
